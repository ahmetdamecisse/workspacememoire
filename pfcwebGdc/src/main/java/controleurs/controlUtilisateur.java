package controleurs;

import com.gdc.test.dao.Idao;
import com.gdc.test.jpa.*;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import org.primefaces.context.RequestContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Ahmet Dame CISSE
 */
@Named(value = "controlUtilisateur")
@SessionScoped
public class controlUtilisateur implements Serializable {
    
    //couche DAO
    private Idao dao;

    //Instanciation couche DAO
    @PostConstruct
    public void init() {
        try {
            ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config-dao.xml");
            dao = (Idao) ctx.getBean("dao");
        } catch (Throwable th) {
        }
    }
    private String username;
    private String password;
    /**
     * Creates a new instance of controlUtilisateur
     */
    public controlUtilisateur() {
    }
    public List<Users> allUsers(){
        return dao.getALLutilisateur();
    }
    public void setList(List<Users>lst){
            
    }
    public String loginControl(){
           if(dao.loginControl(username, password).equals("lemployeurEstTrouve")){
               System.out.println("lemployeurEstTrouve");
               return "employeur.xhtml?faces-redirect=true";
           }
           else if(dao.loginControl(username, password).equals("leCandidatEstTrouve")){
                System.out.println("leCandidatEstTrouve");
               return "candidats.xhtml?faces-redirect=true";
           }
            RequestContext.getCurrentInstance().update("growl");
            FacesContext context=FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "login ou mot de passe invalide!!!"));
            return "";
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
