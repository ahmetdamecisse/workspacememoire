/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.  controlRedigerCV
 */
package controleurs;

import com.gdc.test.jpa.*;
import com.gdc.test.dao.*;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import org.primefaces.event.FlowEvent;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Ahmet Dame CISSE
 */
@Named(value = "redigercvBean")
@SessionScoped
public class controlRedigerCV implements Serializable {

    //couche DAO
    private Idao dao;

    //Instanciation couche DAO
    @PostConstruct
    public void init() {

        user = new Users();
        candidat = new Candidat();
        profil = new Profil();
        profilgl = new Profilgl();
        materielssystemesexploitation = new Materielssystemesexploitation();
        materielssystemesexploitation2 = new Materielssystemesexploitation();
        materielssystemesexploitation3 = new Materielssystemesexploitation();
        formation = new Formation();
        formation2 = new Formation();
        formation3 = new Formation();
        outils = new Outils();
        outils2 = new Outils();
        outils3 = new Outils();
        experiencesprofessionnelles = new Experiencesprofessionnelles();
        experiencesprofessionnelles2 = new Experiencesprofessionnelles();
        experiencesprofessionnelles3 = new Experiencesprofessionnelles();
        langage = new Langages();
        langage2 = new Langages();
        langage3 = new Langages();

        langue = new Langues();
        langue2 = new Langues();
        langue3 = new Langues();

        methodologie = new Methodologie();
        methodologie2 = new Methodologie();
        methodologie3 = new Methodologie();

        modelisation = new Modelisation();
        modelisation2 = new Modelisation();
        modelisation3 = new Modelisation();
        
        bdd = new Bdd();

        try {
            ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config-dao.xml");
            dao = (Idao) ctx.getBean("dao");
        } catch (Throwable th) {
        }
    }
    private Users user;
    private Candidat candidat;
    private Profil profil;
    private Profilgl profilgl;

    private Materielssystemesexploitation materielssystemesexploitation;
    private Materielssystemesexploitation materielssystemesexploitation2;
    private Materielssystemesexploitation materielssystemesexploitation3;

    private Formation formation;
    private Formation formation2;
    private Formation formation3;

    private Outils outils;
    private Outils outils2;
    private Outils outils3;

    private Experiencesprofessionnelles experiencesprofessionnelles;
    private Experiencesprofessionnelles experiencesprofessionnelles2;
    private Experiencesprofessionnelles experiencesprofessionnelles3;

    public Materielssystemesexploitation getMaterielssystemesexploitation2() {
        return materielssystemesexploitation2;
    }

    public void setMaterielssystemesexploitation2(Materielssystemesexploitation materielssystemesexploitation2) {
        this.materielssystemesexploitation2 = materielssystemesexploitation2;
    }

    public Materielssystemesexploitation getMaterielssystemesexploitation3() {
        return materielssystemesexploitation3;
    }

    public void setMaterielssystemesexploitation3(Materielssystemesexploitation materielssystemesexploitation3) {
        this.materielssystemesexploitation3 = materielssystemesexploitation3;
    }

    public Outils getOutils2() {
        return outils2;
    }

    public void setOutils2(Outils outils2) {
        this.outils2 = outils2;
    }

    public Outils getOutils3() {
        return outils3;
    }

    public void setOutils3(Outils outils3) {
        this.outils3 = outils3;
    }

    public Experiencesprofessionnelles getExperiencesprofessionnelles2() {
        return experiencesprofessionnelles2;
    }

    public void setExperiencesprofessionnelles2(Experiencesprofessionnelles experiencesprofessionnelles2) {
        this.experiencesprofessionnelles2 = experiencesprofessionnelles2;
    }

    public Experiencesprofessionnelles getExperiencesprofessionnelles3() {
        return experiencesprofessionnelles3;
    }

    public void setExperiencesprofessionnelles3(Experiencesprofessionnelles experiencesprofessionnelles3) {
        this.experiencesprofessionnelles3 = experiencesprofessionnelles3;
    }

    public Langages getLangage2() {
        return langage2;
    }

    public void setLangage2(Langages langage2) {
        this.langage2 = langage2;
    }

    public Langages getLangage3() {
        return langage3;
    }

    public void setLangage3(Langages langage3) {
        this.langage3 = langage3;
    }

    public Langues getLangue() {
        return langue;
    }

    public void setLangue(Langues langue) {
        this.langue = langue;
    }

    public Langues getLangue2() {
        return langue2;
    }

    public void setLangue2(Langues langue2) {
        this.langue2 = langue2;
    }

    public Langues getLangue3() {
        return langue3;
    }

    public void setLangue3(Langues langue3) {
        this.langue3 = langue3;
    }

    public Methodologie getMethodologie2() {
        return methodologie2;
    }

    public void setMethodologie2(Methodologie methodologie2) {
        this.methodologie2 = methodologie2;
    }

    public Methodologie getMethodologie3() {
        return methodologie3;
    }

    public void setMethodologie3(Methodologie methodologie3) {
        this.methodologie3 = methodologie3;
    }

    public Modelisation getModelisation2() {
        return modelisation2;
    }

    public void setModelisation2(Modelisation modelisation2) {
        this.modelisation2 = modelisation2;
    }

    public Modelisation getModelisation3() {
        return modelisation3;
    }

    public void setModelisation3(Modelisation modelisation3) {
        this.modelisation3 = modelisation3;
    }

    private Langages langage;
    private Langages langage2;
    private Langages langage3;

    private Langues langue;
    private Langues langue2;
    private Langues langue3;

    private Methodologie methodologie;
    private Methodologie methodologie2;
    private Methodologie methodologie3;

    private Modelisation modelisation;
    private Modelisation modelisation2;
    private Modelisation modelisation3;

    private Bdd bdd;

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

    public Formation getFormation2() {
        return formation2;
    }

    public void setFormation2(Formation formation2) {
        this.formation2 = formation2;
    }

    public Formation getFormation3() {
        return formation3;
    }

    public void setFormation3(Formation formation3) {
        this.formation3 = formation3;
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
