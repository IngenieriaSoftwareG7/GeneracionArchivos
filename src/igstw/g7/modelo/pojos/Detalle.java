package igstw.g7.modelo.pojos;

public class Detalle {
    private Integer d_orden;

    private Integer con_pla_id;

    private Integer con_nivel;

    private String con_tipo;

    private String d_nombre;

    private String d_campo;

    private Integer d_tamanio;

    private String d_tipo;

    private String d_cifrado;

    private Integer d_transforma;

    private String d_trans_ori;

    private Integer d_sumador;

    private Integer d_contador;

    public Integer getD_orden() {
        return d_orden;
    }

    public void setD_orden(Integer d_orden) {
        this.d_orden = d_orden;
    }

    public Integer getCon_pla_id() {
        return con_pla_id;
    }

    public void setCon_pla_id(Integer con_pla_id) {
        this.con_pla_id = con_pla_id;
    }

    public Integer getCon_nivel() {
        return con_nivel;
    }

    public void setCon_nivel(Integer con_nivel) {
        this.con_nivel = con_nivel;
    }

    public String getCon_tipo() {
        return con_tipo;
    }

    public void setCon_tipo(String con_tipo) {
        this.con_tipo = con_tipo == null ? null : con_tipo.trim();
    }

    public String getD_nombre() {
        return d_nombre;
    }

    public void setD_nombre(String d_nombre) {
        this.d_nombre = d_nombre == null ? null : d_nombre.trim();
    }

    public String getD_campo() {
        return d_campo;
    }

    public void setD_campo(String d_campo) {
        this.d_campo = d_campo == null ? null : d_campo.trim();
    }

    public Integer getD_tamanio() {
        return d_tamanio;
    }

    public void setD_tamanio(Integer d_tamanio) {
        this.d_tamanio = d_tamanio;
    }

    public String getD_tipo() {
        return d_tipo;
    }

    public void setD_tipo(String d_tipo) {
        this.d_tipo = d_tipo == null ? null : d_tipo.trim();
    }

    public String getD_cifrado() {
        return d_cifrado;
    }

    public void setD_cifrado(String d_cifrado) {
        this.d_cifrado = d_cifrado == null ? null : d_cifrado.trim();
    }

    public Integer getD_transforma() {
        return d_transforma;
    }

    public void setD_transforma(Integer d_transforma) {
        this.d_transforma = d_transforma;
    }

    public String getD_trans_ori() {
        return d_trans_ori;
    }

    public void setD_trans_ori(String d_trans_ori) {
        this.d_trans_ori = d_trans_ori == null ? null : d_trans_ori.trim();
    }

    public Integer getD_sumador() {
        return d_sumador;
    }

    public void setD_sumador(Integer d_sumador) {
        this.d_sumador = d_sumador;
    }

    public Integer getD_contador() {
        return d_contador;
    }

    public void setD_contador(Integer d_contador) {
        this.d_contador = d_contador;
    }
}