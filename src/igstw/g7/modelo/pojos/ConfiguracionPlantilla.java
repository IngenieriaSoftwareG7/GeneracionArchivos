package igstw.g7.modelo.pojos;

import java.util.List;

public class ConfiguracionPlantilla {
    private String c_tipo;

    private Integer c_nivel;

    private Integer pla_id;

    private String c_estado;
    
    private List<Detalle> listadetalle;

    public String getC_tipo() {
        return c_tipo;
    }

    public void setC_tipo(String c_tipo) {
        this.c_tipo = c_tipo == null ? null : c_tipo.trim();
    }

    public Integer getC_nivel() {
        return c_nivel;
    }

    public void setC_nivel(Integer c_nivel) {
        this.c_nivel = c_nivel;
    }

    public Integer getPla_id() {
        return pla_id;
    }

    public void setPla_id(Integer pla_id) {
        this.pla_id = pla_id;
    }

    public String getC_estado() {
        return c_estado;
    }

    public void setC_estado(String c_estado) {
        this.c_estado = c_estado == null ? null : c_estado.trim();
    }
}