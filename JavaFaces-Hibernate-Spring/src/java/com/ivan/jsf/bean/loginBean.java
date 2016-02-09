
package com.ivan.jsf.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import com.ivan.jhs.bo.LoginImplBO;
import com.ivan.jhs.bo.LoginBO;

/**
 *
 * @author ivan
 */
public class loginBean {
    
    private String mensaje;
    private Boolean status;
    private String user;
    private String password;
    private String nombre;
    private Integer edad;
    private List<loginBean> listaUsuarios;
    private LoginImplBO loginBO;

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public List<loginBean> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(List<loginBean> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }
    
    public String validarLogin(){
        System.out.println("User :"+getUser());
        System.out.println("Password :"+getPassword());
        getLoginBO().validaLogin(this);
        System.out.println(this.getMensaje());
          if (this.getStatus()){
              ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
              Map<String, Object> sessionMap = externalContext.getSessionMap();
              setListaUsuarios(new ArrayList<>());
              sessionMap.put("listaUsuarios", getListaUsuarios());
              return "alumnos/alumno";
          }else{
              return "login";
          }
        
        
    }

    public void getLoginBO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   public void setLoginBO(LoginBO loginBO){
       this.loginBO = this.loginBO;
   } 
    
    
    
}
