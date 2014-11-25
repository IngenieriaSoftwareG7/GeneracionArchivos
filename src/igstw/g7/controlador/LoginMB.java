package igstw.g7.controlador;

import igstw.g7.modelo.dao.UsuarioDao;
import igstw.g7.modelo.dao.UsuarioDaoImpl;
import igstw.g7.modelo.pojos.Usuario;
import igstw.g7.vista.extras.Util;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

@ManagedBean
@SessionScoped
public class LoginMB implements Serializable {

	private static final long serialVersionUID = 1L;
	private Usuario usuarioFormu;
	private UsuarioDao usuarioDao;
	private final int MENU_ADMINISTRADOR = 1;
	private final int MENU_OPERADOR = 2;
	private final String USUARIO_ACTIVO = "A";
	private final String USUARIO_INACTIVO = "I";

	public LoginMB() {
		init();
	}

	private void init() {
		usuarioFormu = new Usuario();
		usuarioDao = new UsuarioDaoImpl();
	}

	public void validarDatos() {

		// /FacesContext.getCurrentInstance().
		// addMessage(null,new FacesMessage(FacesMessage.SEVERITY_ERROR,
		// "USUARIO NO EXISTE EN EL SISTEMA", "Error en usuario y/o clave"));
	}

	// Metodos de managed bean
	public String iniciarSesion(){
		String paginaDireccionada="";
		usuarioFormu=usuarioDao.obtenerUsuario(usuarioFormu);
		HttpSession session=null;
		if(usuarioFormu==null){
            usuarioFormu=new Usuario();
			FacesContext.getCurrentInstance().
            addMessage("sesionValidacion",new FacesMessage(FacesMessage.SEVERITY_ERROR, "USUARIO NO EXISTE EN EL SISTEMA", "Error en usuario y/o clave"));
			paginaDireccionada="";
			}
		else{
			if(usuarioFormu.getU_estado().equals(USUARIO_ACTIVO)){
				if(usuarioFormu.getRol().getR_id()!=null){
					if(usuarioFormu.getRol().getR_id().intValue()==MENU_ADMINISTRADOR){
						session = Util.getSession();
						session.setAttribute("username", usuarioFormu.getNombreCompleto());
						session.setAttribute("rol", usuarioFormu.getRol().getR_des());
						paginaDireccionada="irAMenuAdministrador";
					}
					else if(usuarioFormu.getRol().getR_id().intValue()==MENU_OPERADOR){
						session = Util.getSession();
						session.setAttribute("username", usuarioFormu.getNombreCompleto());
						session.setAttribute("rol", usuarioFormu.getRol().getR_des());
						paginaDireccionada="irAMenuOperador";
						}
					}
					else{
						FacesContext.getCurrentInstance().
			            addMessage("sesionValidacion",new FacesMessage(FacesMessage.SEVERITY_ERROR, "USUARIO NO TIENE ROL", "EL USUARIO NO SE ENCUENTRA CON ALGUN ROL ASOCIADO"));
						}
				}
			else if(usuarioFormu.getU_estado().equals(USUARIO_INACTIVO)){
				FacesContext.getCurrentInstance().
	            addMessage("sesionValidacion",new FacesMessage(FacesMessage.SEVERITY_ERROR, "USUARIO INACTIVO", "EL USUARIO SE ENCUENTRA INACTIVO"));
				}
			
				}
			
			
			return paginaDireccionada;

		}

	public String cerrarSesion() {
		HttpSession session = Util.getSession();
		session.invalidate();
		return "cerrarSesion";
	}

	public Usuario getUsuarioFormu() {
		return usuarioFormu;
	}

	public void setUsuarioFormu(Usuario usuarioFormu) {
		this.usuarioFormu = usuarioFormu;
	}

}
