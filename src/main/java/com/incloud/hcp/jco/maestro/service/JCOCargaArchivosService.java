package com.incloud.hcp.jco.maestro.service;

import com.incloud.hcp.jco.maestro.dto.CargaArchivoImports;
import com.incloud.hcp.jco.maestro.dto.CargaDescargaArchivosExports;
import com.incloud.hcp.jco.maestro.dto.CargaDescargaArchivosImports;
import com.incloud.hcp.util.Mensaje;

public interface JCOCargaArchivosService {

    Mensaje CargaArchivo(CargaArchivoImports imports)throws Exception;
    CargaDescargaArchivosExports CargaDescargaArchivos(CargaDescargaArchivosImports imports)throws Exception;


}
