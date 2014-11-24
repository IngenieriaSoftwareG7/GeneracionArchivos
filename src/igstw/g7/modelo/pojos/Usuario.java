package igstw.g7.modelo.pojos;

import java.io.Serializable;

public class Usuario implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;


    private String u_cod;

    private String u_nom;

    private String u_ape_pat;


    private String u_ape_mat;

    private String u_con;

    private String u_estado;

    private Rol rol;
    public Usuario(){
    	rol=new Rol();
    }
    public String getU_cod() {
        return u_cod;
    }

   
    public void setU_cod(String u_cod) {
        this.u_cod = u_cod == null ? null : u_cod.trim();
    }

  
    public String getU_nom() {
        return u_nom;
    }

    public void setU_nom(String u_nom) {
        this.u_nom = u_nom == null ? null : u_nom.trim();
    }

    
    public String getU_ape_pat() {
        return u_ape_pat;
    }

   
    public void setU_ape_pat(String u_ape_pat) {
        this.u_ape_pat = u_ape_pat == null ? null : u_ape_pat.trim();
    }

   
    public String getU_ape_mat() {
        return u_ape_mat;
    }

   
    public void setU_ape_mat(String u_ape_mat) {
        this.u_ape_mat = u_ape_mat == null ? null : u_ape_mat.trim();
    }

   
    public String getU_con() {
        return u_con;
    }

    
    public void setU_con(String u_con) {
        this.u_con = u_con == null ? null : u_con.trim();
    }

    
    public String getU_estado() {
        return u_estado;
    }

    public void setU_estado(String u_estado) {
        this.u_estado = u_estado == null ? null : u_estado.trim();
    }

   

	public Rol getRol() {
		return rol;
	}


	public void setRol(Rol rol) {
		this.rol = rol;
	}
    
    public String getNombreCompleto(){
    	return this.u_nom+" "+this.u_ape_pat+" "+this.u_ape_mat;
    }
}