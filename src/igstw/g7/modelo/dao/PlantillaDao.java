package igstw.g7.modelo.dao;

import igstw.g7.modelo.pojos.Plantilla;
import igstw.g7.modelo.pojos.SQLAdapter;

import java.util.HashMap;
import java.util.List;

public interface PlantillaDao {
	public List<Plantilla> obtenerPlantillas();

	public boolean registrarNuevaPlantilla(Plantilla plantilla);
	
	public List<HashMap<String,Object>> ejecutarQuery(SQLAdapter sqlAdapter);
}
