package igstw.g7.pruebas;

import igstw.g7.modelo.pojos.Plantilla;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by lucero on 27/11/2014.
 */
public class EscribirArchivo {



    public static void  generarArchivo(Plantilla plantilla){

        String[] headers=new String[10];//se llena con los campos que se debe mostar
        FileWriter fichero = null;
        PrintWriter pw = null;
        String ruta ="output";
        List<HashMap<String,Object>> detail =new ArrayList<HashMap<String, Object>>();//lista de filas que devuelve al ejecutar la sentencia sql
        try
        {
            fichero = new FileWriter("c:/output.txt");
            pw = new PrintWriter(fichero);
//llenar los headers
            for (int i = 0; i < headers.length; i++) {
                String titulo=headers[i];
                pw.print(String.format("%1$-15s",titulo));
            }
            pw.println();
//llenar el detail
            for(HashMap<String,Object> h:detail){
                for(int j=0;j<headers.length;j++){
                   String campo=String.format("%1$-15s",h.get(headers[j]));
                   pw.print(campo);

                }
                pw.println();
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
    
    
        public static void main(String [] arg) {
    //        EscribirArchivo.generarArchivo(new Plantilla());
        }


    }

