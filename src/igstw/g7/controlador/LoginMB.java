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

import org.primefaces.context.RequestContext;


@ManagedBean
@SessionScoped
public class LoginMB implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Usuario usuarioFormu;
	private UsuarioDao usuarioDao;
	
	public LoginMB(){
		init();
		System.out.println("Hola mundo");
	}
	
	private void init() {
		usuarioFormu=new Usuario();
		usuarioDao=new UsuarioDaoImpl();
	}

	//Metodos de managed bean
	public String iniciarSesion(){
		usuarioFormu=usuarioDao.obtenerUsuario(usuarioFormu);
		if(usuarioFormu==null){
            usuarioFormu=new Usuario();
			FacesContext.getCurrentInstance().
            addMessage(null,new FacesMessage(FacesMessage.SEVERITY_ERROR, "USUARIO NO EXISTE EN EL SISTEMA", "Error en usuario y/o clave"));
			}
		else
			FacesContext.getCurrentInstance().
            addMessage(null,new FacesMessage(FacesMessage.SEVERITY_INFO, "BIENVENIDO AL SISTEMA", "usuario y/o clave correctos"));
		return "";
	}

	public String cerrarSesion(){
		HttpSession session = Util.getSession();
	    session.invalidate();
		return "iniciarSesion";
	}

	public Usuario getUsuarioFormu() {
		return usuarioFormu;
	}

	public void setUsuarioFormu(Usuario usuarioFormu) {
		this.usuarioFormu = usuarioFormu;
	}
	
}
