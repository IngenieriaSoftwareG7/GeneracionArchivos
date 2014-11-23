package igstw.g7.modelo.dao;

import java.io.Serializable;

import org.apache.ibatis.session.SqlSession;

import igstw.g7.modelo.conf.MyBatis.MyBatisUtil;
import igstw.g7.modelo.pojos.Usuario;

public class UsuarioDaoImpl implements Serializable,UsuarioDao{


	private static final long serialVersionUID = 1L;

	@Override
	public Usuario obtenerUsuario(Usuario usuarioFormu) {
		Usuario usuario=null;
        SqlSession session=new MyBatisUtil().getSession();
        if(session!=null){
            try{
                usuario=session.selectOne("UsuarioMapper.obtenerUsuario",usuarioFormu);
            }
            catch(Exception e){
            	e.printStackTrace();
            }
            finally{
                session.close();
            }
        }
		return usuario;
	}

}
