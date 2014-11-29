package igstw.g7.modelo.pojos;

import java.util.Date;
import java.util.List;

public class Plantilla {
    private Integer p_id;

    private String p_nombre;

    private String p_consulta_select;

    private String p_consulta_order;

    private Integer p_n_header;

    private Integer p_n_footer;

    private Integer p_n_detail;

    private String p_estado;

    private Date p_fecha;
    
    private List<ConfiguracionPlantilla> configuracionPlantillas;
    

    public Integer getP_id() {
        return p_id;
    }

    public void setP_id(Integer p_id) {
        this.p_id = p_id;
    }

    public String getP_nombre() {
        return p_nombre;
    }

    public void setP_nombre(String p_nombre) {
        this.p_nombre = p_nombre == null ? null : p_nombre.trim();
    }

    public String getP_consulta_select() {
        return p_consulta_select;
    }

    public void setP_consulta_select(String p_consulta_select) {
        this.p_consulta_select = p_consulta_select == null ? null : p_consulta_select.trim();
    }

    public String getP_consulta_order() {
        return p_consulta_order;
    }

    public void setP_consulta_order(String p_consulta_order) {
        this.p_consulta_order = p_consulta_order == null ? null : p_consulta_order.trim();
    }

    public Integer getP_n_header() {
        return p_n_header;
    }

    public void setP_n_header(Integer p_n_header) {
        this.p_n_header = p_n_header;
    }

    public Integer getP_n_footer() {
        return p_n_footer;
    }

    public void setP_n_footer(Integer p_n_footer) {
        this.p_n_footer = p_n_footer;
    }

    public Integer getP_n_detail() {
        return p_n_detail;
    }

    public void setP_n_detail(Integer p_n_detail) {
        this.p_n_detail = p_n_detail;
    }

    public String getP_estado() {
        return p_estado;
    }

    public void setP_estado(String p_estado) {
        this.p_estado = p_estado == null ? null : p_estado.trim();
    }

    public Date getP_fecha() {
        return p_fecha;
    }

    public void setP_fecha(Date p_fecha) {
        this.p_fecha = p_fecha;
    }

	public List<ConfiguracionPlantilla> getConfiguracionPlantillas() {
		return configuracionPlantillas;
	}

	public void setConfiguracionPlantillas(
			List<ConfiguracionPlantilla> configuracionPlantillas) {
		this.configuracionPlantillas = configuracionPlantillas;
	}
    
    
}