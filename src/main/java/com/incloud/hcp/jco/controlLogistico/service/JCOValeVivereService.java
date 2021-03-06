package com.incloud.hcp.jco.controlLogistico.service;

import com.incloud.hcp.jco.controlLogistico.dto.*;

public interface JCOValeVivereService {

    ValeViveresExports ListarValeViveres(ValeViveresImports imports)throws Exception;
    VvGuardaExports GuardarValeViveres(VvGuardaImports imports)throws Exception;
    CostoRacionValevExports CostoRacionValev(CostoRacionValevImports imports)throws Exception;
    AnularValevExports AnularValev(AnularValevImports imports)throws Exception;
}
