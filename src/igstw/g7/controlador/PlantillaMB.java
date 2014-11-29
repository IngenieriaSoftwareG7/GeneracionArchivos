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
public class PlantillaMB {
	PlantillaDao plantillaDao=null;
	List<Plantilla> plantillas=null;
	Plantilla plantilla=null;
	public  PlantillaMB() {
		init();
	}

	private void init() {
		cargarDatos();
	}
	public void cargarDatos(){
		if(plantilla==null)
			plantilla=new Plantilla();
		if(plantillaDao==null)
			plantillaDao = new PlantillaDaoImpl();
		if(plantillas==null)
			plantillas=plantillaDao.obtenerPlantillas();
	}
	public void registrarNuevaPlantilla(){
		boolean exitoRegPlantilla=plantillaDao.registrarNuevaPlantilla(plantilla);
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

	public Plantilla getPlantilla() {
		return plantilla;
	}

	public void setPlantilla(Plantilla plantilla) {
		this.plantilla = plantilla;
	}
	
}
