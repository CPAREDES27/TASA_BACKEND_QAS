package com.incloud.hcp.jco.preciospesca.dto;

import java.util.List;

public class PrecioPescaMantImports {
    private String p_user;
    private String p_indtr;
    private List<PoliticaPrecios> str_ppc;

    public String getP_user() {
        return p_user;
    }

    public void setP_user(String p_user) {
        this.p_user = p_user;
    }

    public String getP_indtr() {
        return p_indtr;
    }

    public void setP_indtr(String p_indtr) {
        this.p_indtr = p_indtr;
    }

    public List<PoliticaPrecios> getStr_ppc() {
        return str_ppc;
    }

    public void setStr_ppc(List<PoliticaPrecios> str_ppc) {
        this.str_ppc = str_ppc;
    }
}
