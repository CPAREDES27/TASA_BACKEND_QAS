package com.incloud.hcp.jco.maestro.dto;

public class BombasDto {

    public String CDBOM;     //Codigo bomba
    public String DSBOM;     //Descripcion de bomba

    public String getCDBOM() {
        return CDBOM;
    }

    public void setCDBOM(String CDBOM) {
        this.CDBOM = CDBOM;
    }

    public String getDSBOM() {
        return DSBOM;
    }

    public void setDSBOM(String DSBOM) {
        this.DSBOM = DSBOM;
    }

    public String getESREG() {
        return ESREG;
    }

    public void setESREG(String ESREG) {
        this.ESREG = ESREG;
    }

    public String ESREG;     //estado de registro
}
