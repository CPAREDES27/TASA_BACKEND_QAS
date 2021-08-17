package com.incloud.hcp.jco.maestro.dto;

import java.util.HashMap;
import java.util.List;

public class EmbarcacionNuevImports {

    private EmbarcaImports params;
    private List<HashMap<String, Object>> s_emb;
    private List<HashMap<String, Object>> s_ppe;
    private List<HashMap<String, Object>> s_pec;
    private List<HashMap<String, Object>> s_epe;
    private List<HashMap<String, Object>> s_bpe;
    private List<HashMap<String, Object>> str_hor;

    public EmbarcaImports getParams() {
        return params;
    }

    public void setParams(EmbarcaImports params) {
        this.params = params;
    }

    public List<HashMap<String, Object>> getS_emb() {
        return s_emb;
    }

    public void setS_emb(List<HashMap<String, Object>> s_emb) {
        this.s_emb = s_emb;
    }

    public List<HashMap<String, Object>> getS_ppe() {
        return s_ppe;
    }

    public void setS_ppe(List<HashMap<String, Object>> s_ppe) {
        this.s_ppe = s_ppe;
    }

    public List<HashMap<String, Object>> getS_pec() {
        return s_pec;
    }

    public void setS_pec(List<HashMap<String, Object>> s_pec) {
        this.s_pec = s_pec;
    }

    public List<HashMap<String, Object>> getS_epe() {
        return s_epe;
    }

    public void setS_epe(List<HashMap<String, Object>> s_epe) {
        this.s_epe = s_epe;
    }

    public List<HashMap<String, Object>> getS_bpe() {
        return s_bpe;
    }

    public void setS_bpe(List<HashMap<String, Object>> s_bpe) {
        this.s_bpe = s_bpe;
    }

    public List<HashMap<String, Object>> getStr_hor() {
        return str_hor;
    }

    public void setStr_hor(List<HashMap<String, Object>> str_hor) {
        this.str_hor = str_hor;
    }
}
