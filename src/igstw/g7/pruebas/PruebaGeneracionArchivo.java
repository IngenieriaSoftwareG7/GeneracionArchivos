package igstw.g7.pruebas;

import static org.junit.Assert.*;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import igstw.g7.modelo.dao.PlantillaDao;
import igstw.g7.modelo.dao.PlantillaDaoImpl;
import igstw.g7.modelo.pojos.SQLAdapter;

import org.junit.Test;

public class PruebaGeneracionArchivo {

	@Test
	public void test() {
		String query="select * from alumno";
		SQLAdapter sqlAdapter=new SQLAdapter(query);
		PlantillaDao plantillaDao=new PlantillaDaoImpl();
		generarArchivo(plantillaDao.ejecutarQuery(sqlAdapter));
	}
	

     
	 public void  generarArchivo(List<HashMap<String,Object>> details){
		  Object[] headers = details.get(0).keySet().toArray();
	      /* String[] headers=new String[4];//se llena con los campos que se debe mostar
	       headers[0]="codigo";
	       headers[1]="nombre";
	       headers[2]="apellidos";
	       headers[3]="edad";*/
	       
	       FileWriter fichero = null;
	        PrintWriter pw = null;
	        String ruta ="output";
	       // List<HashMap<String,Object>> detail =new ArrayList<HashMap<String, Object>>();//lista de filas que devuelve al ejecutar la sentencia sql
	        try
	        {
	            fichero = new FileWriter("D:/output.txt");
	            pw = new PrintWriter(fichero);
	//llenar los headers
	            for (int i = 0; i < headers.length; i++) {
	                String titulo=String.valueOf(headers[i]);
	                pw.print(String.format("%1$-15s",titulo));
	            }
	            pw.println();
	//llenar el detail
	            for(HashMap<String,Object> h:details){
	            	
	                for(int j=0;j<headers.length;j++){
	                   String campo=String.format("%1$-15s",h.get(headers[j]));
	                   pw.print(campo);

	                }
	                pw.println();
	                pw.flush();
	            }


	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	
	
}
