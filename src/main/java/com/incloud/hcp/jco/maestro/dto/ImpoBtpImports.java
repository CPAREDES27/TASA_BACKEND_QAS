package com.incloud.hcp.jco.maestro.dto;

import java.util.HashMap;
import java.util.List;

public class ImpoBtpImports {
    private String ip_tpcarga;
    private List<HashMap<String, Object>> listData;

    public String getIp_tpcarga() {
        return ip_tpcarga;
    }

    public void setIp_tpcarga(String ip_tpcarga) {
        this.ip_tpcarga = ip_tpcarga;
    }

    public List<HashMap<String, Object>> getListData() {
        return listData;
    }

    public void setListData(List<HashMap<String, Object>> listData) {
        this.listData = listData;
    }
}
