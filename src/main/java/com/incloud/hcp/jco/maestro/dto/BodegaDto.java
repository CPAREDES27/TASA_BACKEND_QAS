package com.incloud.hcp.jco.maestro.dto;

public class BodegaDto {
    public String CDBOD;   //Codigo de Bodega
    public String DSBOD;    //Descripcion bodega
    public String ESREG;    //estado registro

    public String getCDBOD() {
        return CDBOD;
    }

    public void setCDBOD(String CDBOD) {
        this.CDBOD = CDBOD;
    }

    public String getDSBOD() {
        return DSBOD;
    }

    public void setDSBOD(String DSBOD) {
        this.DSBOD = DSBOD;
    }

    public String getESREG() {
        return ESREG;
    }

    public void setESREG(String ESREG) {
        this.ESREG = ESREG;
    }

}
