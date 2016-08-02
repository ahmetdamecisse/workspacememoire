package controleurs;

import com.gdc.sessionsbeans.UsersFacade;
import com.gdc.sessionsbeans.UserRolesFacade;
import com.gdc.entites.Users;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Ahmet Dame CISSE
 */
@ManagedBean
@ViewScoped
public class controlUtilisateur implements Serializable {
    @EJB
    private UserRolesFacade userRolesFacade;
    @EJB
    private UsersFacade usersFacade;

    
    private String username;
    private String password;

    /**
     * Creates a new instance of controlUtilisateur
     */
    public controlUtilisateur() {
    }

    public List<Users> allUsers() {
        return usersFacade.findAll();
    }

    public void setList(List<Users> lst) {

    }

    public String loginControl() {
//           if(dao.loginControl(username, password).equals("lemployeurEstTrouve")){
//               System.out.println("lemployeurEstTrouve");
//               return "employeur.xhtml?faces-redirect=true";
//           }
//           else if(dao.loginControl(username, password).equals("leCandidatEstTrouve")){
//                System.out.println("leCandidatEstTrouve");
//               return "candidats.xhtml?faces-redirect=true";
//           }
//            RequestContext.getCurrentInstance().update("growl");
//            FacesContext context=FacesContext.getCurrentInstance();
//            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "login ou mot de passe invalide!!!"));
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
