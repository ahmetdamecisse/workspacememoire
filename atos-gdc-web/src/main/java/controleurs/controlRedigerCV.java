/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.  controlRedigerCV
 */
package controleurs;

import com.gdc.entites.Outils;
import com.gdc.entites.Langages;
import com.gdc.entites.Langues;
import com.gdc.entites.Modelisation;
import com.gdc.entites.Materielssystemesexploitation;
import com.gdc.entites.Bdd;
import com.gdc.entites.Experiencesprofessionnelles;
import com.gdc.entites.Candidat;
import com.gdc.entites.Methodologie;
import com.gdc.entites.Formation;
import com.gdc.entites.Users;
import com.gdc.entites.Profil;
import com.gdc.entites.Profilgl;
import com.gdc.sessionsbeans.BddFacade;
import com.gdc.sessionsbeans.CandidatFacade;
import com.gdc.sessionsbeans.ExperiencesprofessionnellesFacade;
import com.gdc.sessionsbeans.FormationFacade;
import com.gdc.sessionsbeans.LangagesFacade;
import com.gdc.sessionsbeans.MaterielssystemesexploitationFacade;
import com.gdc.sessionsbeans.MethodologieFacade;
import com.gdc.sessionsbeans.ModelisationFacade;
import com.gdc.sessionsbeans.OutilsFacade;
import com.gdc.sessionsbeans.ProfilFacade;
import com.gdc.sessionsbeans.ProfilglFacade;
import com.gdc.sessionsbeans.UsersFacade;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;
import javax.ejb.EJB;
import org.primefaces.event.FlowEvent;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author Ahmet Dame CISSE
 */
@ManagedBean
@ViewScoped
public class controlRedigerCV implements Serializable {

//**********************session beans ****************************
    @EJB
    private UsersFacade usersFacade;
    @EJB
    private BddFacade bddFacade;
    @EJB
    private ModelisationFacade modelisationFacade;
    @EJB
    private MethodologieFacade methodologieFacade;
    @EJB
    private LangagesFacade langagesFacade;
    @EJB
    private ExperiencesprofessionnellesFacade experiencesprofessionnellesFacade;
    @EJB
    private OutilsFacade outilsFacade;
    @EJB
    private FormationFacade formationFacade;
    @EJB
    private MaterielssystemesexploitationFacade materielssystemesexploitationFacade;
    @EJB
    private ProfilglFacade profilglFacade;
    @EJB
    private ProfilFacade profilFacade;
    @EJB
    private CandidatFacade candidatFacade;

    //**********************session beans ****************************
    private Users user = new Users();
    private Candidat candidat = new Candidat();
    private Profilgl profilgl = new Profilgl();
    private Profil profil = new Profil();
    private Materielssystemesexploitation materielssystemesexploitation = new Materielssystemesexploitation();
    private Formation formation = new Formation();
    private Formation formation2 = new Formation();
    private Formation formation3 = new Formation();
    private Outils outils = new Outils();
    private Experiencesprofessionnelles experiencesprofessionnelles = new Experiencesprofessionnelles();
    private Langages langage = new Langages();
    private Methodologie methodologie = new Methodologie();
    private Modelisation modelisation = new Modelisation();
    private Bdd bdd = new Bdd();

    private boolean skip;

    /**
     * Creates a new instance of controlUtilisateur
     */
    public controlRedigerCV() {
    }

    public Profilgl getProfilgl() {
        return profilgl;
    }

    public void setProfilgl(Profilgl profilgl) {
        this.profilgl = profilgl;
    }

    public Profil getProfil() {
        return profil;
    }

    public void setProfil(Profil profil) {
        this.profil = profil;
    }

    public Materielssystemesexploitation getMaterielssystemesexploitation() {
        return materielssystemesexploitation;
    }

    public void setMaterielssystemesexploitation(Materielssystemesexploitation materielssystemesexploitation) {
        this.materielssystemesexploitation = materielssystemesexploitation;
    }

    public Outils getOutils() {
        return outils;
    }

    public void setOutils(Outils outils) {
        this.outils = outils;
    }

    public Experiencesprofessionnelles getExperiencesprofessionnelles() {
        return experiencesprofessionnelles;
    }

    public void setExperiencesprofessionnelles(Experiencesprofessionnelles experiencesprofessionnelles) {
        this.experiencesprofessionnelles = experiencesprofessionnelles;
    }

    public Langages getLangage() {
        return langage;
    }

    public void setLangage(Langages langage) {
        this.langage = langage;
    }

    public Methodologie getMethodologie() {
        return methodologie;
    }

    public void setMethodologie(Methodologie methodologie) {
        this.methodologie = methodologie;
    }

    public Modelisation getModelisation() {
        return modelisation;
    }

    public void setModelisation(Modelisation modelisation) {
        this.modelisation = modelisation;
    }

    public Bdd getBdd() {
        return bdd;
    }

    public void setBdd(Bdd bdd) {
        this.bdd = bdd;
    }

    public Langues getLangues() {
        return langues;
    }

    public void setLangues(Langues langues) {
        this.langues = langues;
    }
    private Langues langues = new Langues();

    public Candidat getCandidat() {
        return candidat;
    }

    public Formation getFormation() {
        return formation;
    }

    public void setFormation(Formation formation) {
        this.formation = formation;
    }

    public void setCandidat(Candidat candidat) {
        this.candidat = candidat;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public void save() {
        //----------------Les insertions se feront dans cette partie-----------------------------------------------------------------
        FacesMessage msg = new FacesMessage("Successful", "Bonjour :" + user.getPrenom() + " " + "votre cv a été crée avec succès");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    public boolean isSkip() {
        return skip;
    }

    public void setSkip(boolean skip) {
        this.skip = skip;
    }

    public String onFlowProcess(FlowEvent event) {
        if (skip) {
            skip = false;   //reset in case user goes back
            return "confirm";
        } else {
            return event.getNewStep();
        }
    }

}
