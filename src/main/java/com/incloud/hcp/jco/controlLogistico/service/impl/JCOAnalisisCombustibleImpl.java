package com.incloud.hcp.jco.controlLogistico.service.impl;

import com.incloud.hcp.jco.controlLogistico.dto.ControlLogExports;
import com.incloud.hcp.jco.controlLogistico.dto.ControlLogImports;
import com.incloud.hcp.jco.controlLogistico.service.JCOAnalisisCombustibleService;
import com.incloud.hcp.util.Constantes;
import com.incloud.hcp.util.Metodos;
import com.incloud.hcp.util.Tablas;
import com.sap.conn.jco.*;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class JCOAnalisisCombustibleImpl implements JCOAnalisisCombustibleService {

    public ControlLogExports Listar(ControlLogImports imports)throws Exception{

        ControlLogExports ce= new ControlLogExports();

        try {

            JCoDestination destination = JCoDestinationManager.getDestination(Constantes.DESTINATION_NAME);
            JCoRepository repo = destination.getRepository();

            JCoFunction stfcConnection = repo.getFunction(Constantes.ZFL_RFC_LECT_MAES_VIVER);
            JCoParameterList importx = stfcConnection.getImportParameterList();
            importx.setValue("P_USER", imports.getP_user());
            importx.setValue("ROWCOUNT", imports.getRowcount());

            JCoParameterList tables = stfcConnection.getTableParameterList();
            stfcConnection.execute(destination);

            JCoTable tableExport = tables.getTable(Tablas.STR_CSMAR);

            Metodos metodo = new Metodos();
            //List<HashMap<String, Object>> data = metodo.ListarObjetos(tableExport);
            String[] fields=imports.getFields();
            List<HashMap<String, Object>> data = metodo.ObtenerListObjetos(tableExport, fields);

            ce.setData(data);
            ce.setMensaje("Ok");
        }catch (Exception e){
            ce .setMensaje(e.getMessage());
        }

        return ce;
    }
}
