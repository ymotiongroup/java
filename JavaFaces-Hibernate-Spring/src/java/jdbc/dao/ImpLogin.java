/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc.dao;
import com.ivan.jhs.persistence.Login;
import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;


/**
 *
 * @author ivan
 */
public class ImpLogin extends HibernateDaoSupport implements IfaceLogin {
    
     public Login validaLogin(Login obj){
         List<Object> list = getHibernateTemplate().find("from Login where usuario = ? and password = ?"
                 ,obj.getUsuario() , obj.getPassword() );
         if (list.size() > 0){
             return (Login) list.get(0);
         }
         
            return null; 
      
     }
}
