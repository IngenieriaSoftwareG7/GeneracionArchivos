package igstw.g7.modelo.pojos;

import java.io.Serializable;

public class Rol implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer r_id;
	private String r_des;
	public Integer getR_id() {
		return r_id;
	}
	public void setR_id(Integer r_id) {
		this.r_id = r_id;
	}
	public String getR_des() {
		return r_des;
	}
	public void setR_des(String r_des) {
		this.r_des = r_des;
	}
	
}
