/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package igstw.g7.modelo.conf.MyBatis;

import java.io.IOException;
import java.io.Reader;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 *
 * @author Sawakita
 */
public class MyBatisUtil {
    private String resource="igstw/g7/modelo/conf/MyBatis/mybatis-config.xml";
    private SqlSession session=null;
    
    public SqlSession getSession(){
        try{
            Reader reader=Resources.getResourceAsReader(resource);
            SqlSessionFactory sqlMapper=new SqlSessionFactoryBuilder().build(reader);
            session =sqlMapper.openSession(true);
        }
        catch(IOException ex){
            ex.printStackTrace();
        }
        return session;
    }
    
}
