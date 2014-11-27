package igstw.g7.modelo.dao;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import igstw.g7.modelo.conf.MyBatis.MyBatisUtil;
import igstw.g7.modelo.mappers.PlantillaMapper;
import igstw.g7.modelo.pojos.Plantilla;
import igstw.g7.modelo.pojos.Usuario;

public class PlantillaDaoImpl implements Serializable,PlantillaDao{


	private static final long serialVersionUID = 1L;

	@Override
	public List<Plantilla> obtenerPlantillas() {
		SqlSession session=new MyBatisUtil().getSession();
        List<Plantilla> plantillas=null;
		if(session!=null){
       
                    try{
                    	PlantillaMapper plantillaMapper = session.getMapper(PlantillaMapper.class);
                    	plantillas =  plantillaMapper.obtenerPlantillas();
                    	//plantillas=session.selectList("Plantilla.obtenerPlantillas");
                    }
                    catch(Exception e){
                    	e.printStackTrace();
                    }
                    finally{
                        session.close();
                    }
            	}
                    	else{
                    		System.out.println("ERROR NO HAY SESION");
                    	}
        return plantillas;
	}

	

}
