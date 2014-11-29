package igstw.g7.modelo.mappers;

import java.util.HashMap;
import java.util.List;

import igstw.g7.modelo.pojos.Plantilla;
import igstw.g7.modelo.pojos.SQLAdapter;

public interface PlantillaMapper {
	public List<Plantilla> obtenerPlantillas();
	public void registrarNuevaPlantilla(Plantilla plantilla);
	public List<HashMap<String , Object>> ejecutarSQL(SQLAdapter sqlAdapter);
}
