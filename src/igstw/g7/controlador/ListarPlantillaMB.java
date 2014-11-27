package igstw.g7.controlador;

import java.util.List;

import igstw.g7.modelo.dao.PlantillaDao;
import igstw.g7.modelo.dao.PlantillaDaoImpl;
import igstw.g7.modelo.dao.UsuarioDaoImpl;
import igstw.g7.modelo.pojos.Plantilla;
import igstw.g7.modelo.pojos.Usuario;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class ListarPlantillaMB {
	PlantillaDao plantillaDao=null;
	List<Plantilla> plantillas=null;
	public  ListarPlantillaMB() {
		init();
	}

	private void init() {
		plantillaDao = new PlantillaDaoImpl();
		cargarPlantillas();
	}
	public void cargarPlantillas(){
		if(plantillas==null)
			plantillas=plantillaDao.obtenerPlantillas();
	}

	public PlantillaDao getPlantillaDao() {
		return plantillaDao;
	}

	public void setPlantillaDao(PlantillaDao plantillaDao) {
		this.plantillaDao = plantillaDao;
	}

	public List<Plantilla> getPlantillas() {
		return plantillas;
	}

	public void setPlantillas(List<Plantilla> plantillas) {
		this.plantillas = plantillas;
	}
	
}
