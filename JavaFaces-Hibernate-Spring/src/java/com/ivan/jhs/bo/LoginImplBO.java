
package com.ivan.jhs.bo;

import jdbc.dao.ImpLogin;
import com.ivan.jhs.persistence.Login;
import com.ivan.jsf.bean.loginBean;
import org.springframework.stereotype.Service;
/**
 *
 * @author ivan
 */
public class LoginImplBO implements LoginBO {
    
    private implLogin loginDao;

    @Override
    public void validarLogin(loginBean obj) {
        
        Login login = new Login();
        login.setUsuario(obj.getUser());
        login.setPassword(obj.getPassword());
        login = getLoginDAO().validaLogin(login);
        
        
    }

   
     
}
