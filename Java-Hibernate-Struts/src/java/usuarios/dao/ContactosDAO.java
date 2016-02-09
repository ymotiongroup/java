package usuarios.dao;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import usuarios.bean.Login;
import util.HibernateUtil;

/**
 *
 * @author ivan
 */
public class ContactosDAO {
    
    public Login logIn(String nombre,String password){
        
       Login lo = null;

        try {
           
            Session s = HibernateUtil.getSessionFactory().openSession();
               
              lo = (Login) s.createCriteria(Login.class)
                     .add(Restrictions.eq("nombre", nombre))
                     .add(Restrictions.eq("password", password))
                     .uniqueResult();  
                
                      
        } catch (Exception e) {
            
            System.out.println(e);
            
        }
       return lo;
    }
}
