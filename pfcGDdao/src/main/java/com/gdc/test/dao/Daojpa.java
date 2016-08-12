/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdc.test.dao;

import com.gdc.test.exceptions.pfcgdcexception;
import com.gdc.test.jpa.*;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author a618092
 */
@Transactional
public class Daojpa implements Idao, Serializable {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List getALLutilisateur() {
        try {
            return em.createQuery("select u from Users u").getResultList();
        } catch (Throwable th) {
            throw new pfcgdcexception(th, 1);
        }
    }

    public Users getUtilisateurById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void addUtilisateur(Users u) {
        try {
            em.persist(u);
        } catch (Throwable th) {
            System.out.println("erreur lors de l'ajout de l'utilisateur" + u.getNom());
            throw new pfcgdcexception(th, 2);
        }
    }

    public boolean ceUsernameEstIlUtiliseDeja(String username) {
        List<Users> users = getALLutilisateur();
        if (users.size() > 0) {
            for (Iterator<Users> iterator = users.iterator(); iterator.hasNext();) {
                Users next = iterator.next();
                if (next.getUsername().equalsIgnoreCase(username)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void removeUtilisateur(Integer idUtili) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void updateUtilisateur(Users u) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List getUtilisateurByName(String nom) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Users getUtilisateurByLoginAndPassporw(String login, String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List getAllAdministrateur() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void addAdministrateur(Administrateur a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void removeAdministrateur(Integer idAdminAsupp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void updateAdministrateur(Users modifiant, Integer idAdminAmodifier) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Administrateur getAdministrateurById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List getAdministrateurByName(String nom) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List getAllCandidat() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void addCandidat(Candidat c) {
        try {
            em.persist(c);
        } catch (Throwable th) {
            System.out.println("erreur lors de l'ajout du du candidat" + c.getUsername());
            throw new pfcgdcexception(th, 3);
        }
    }

    public void removeCandidat(Candidat c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void updateCandidat(Users utilisateurModifinat, Integer idCandidatAmodifier) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Candidat getCandidatById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List getCandidatByName(String nom) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List getCandidatByFullName(String nom, String prenom) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List getCandidatByCompetencesPrincipales(String cp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List getCandidatByCompetencesFontionnelles(String cf) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List getCandidatByNombreAnneesExperience(int nbreAnneeExp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List getAllRecruteur() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void addRecruteur(Recruteur r) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void removeRecruteur(Integer idRecruteurAsupp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void updateRecruteur(Users recruteurRemplaçant, Integer idRecruteurRemplace) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Recruteur getRecruteurById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List getRecruteurByName(String nom) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List getAllBdd() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void addBdd(Bdd bdd) {
        try {
            em.persist(bdd);
        } catch (Throwable th) {
            System.out.println("erreur lors de l'ajout de la bdd" + bdd.getIdTypeDeProfil());
            throw new pfcgdcexception(th, 3);
        }
    }

    public void removeBdd(Bdd bdd) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void updateBdd(Bdd bdd, Integer idUtilsateurbddModif) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Bdd getBddById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List getBddByName(String nom) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List getAllEntretien() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void addEntretien(Entretien e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void removeEntretien(Entretien e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void updateEntretien(Entretien e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Entretien getEntretienById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List getEntretienByName(String nom) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List getAllExperiencesprofessionnelles() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void addExperiencesprofessionnelles(Experiencesprofessionnelles e) {
        try {
            em.persist(e);
        } catch (Throwable th) {
            System.out.println("erreur lors de la persistence de l'objet experience pro" + e.getDescription());
            throw new pfcgdcexception(th, 10);
        }
    }

    public void removeExperiencesprofessionnelles(Experiencesprofessionnelles e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void updateExperiencesprofessionnelles(Experiencesprofessionnelles e, Integer idUtilsateurEpModif) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Experiencesprofessionnelles getExperiencesprofessionnellesById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List getExperiencesprofessionnellesByName(String nom) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List getAllFichedeposte() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void addFichedeposte(Fichedeposte f) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void removeFichedeposte(Fichedeposte f) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void updateFichedeposte(Fichedeposte f) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Fichedeposte getFichedeposteById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List getFichedeposteByName(String nom) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List getAllFichedetest() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void addFichedetest(Fichedetest f) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void removeFichedetest(Fichedetest f) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void updateFichedetest(Fichedetest f) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Fichedetest getFichedetestById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List getFichedetestByName(String nom) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List getAllFormation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void addFormation(Formation f) {
        try {
            em.persist(f);
        } catch (Throwable th) {
            System.out.println("erreur lors de l'ajout de la formation" + f.getIdTypeDeProfil());
            throw new pfcgdcexception(th, 6);
        }
    }

    public void removeFormation(Formation f) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void updateFormation(Formation f, Integer idUtilsateurFormModif) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Formation getFormationById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List getFormationByName(String nom) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List getAllLangages() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void addLangages(Langages l) {
        try {
            em.persist(l);
        } catch (Throwable th) {
            System.out.println("erreur lors de la persistence de l'objet langage" + l.getDomaine());
            throw new pfcgdcexception(th, 11);
        }
    }

    public void removeLangages(Langages l) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void updateLangages(Langages l, Integer idUtilsateurLangageModif) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Langages getLangagesById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List getLangagesByName(String nom) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List getAllLangue() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void addLangues(Langues l) {
        try {
            em.persist(l);
        } catch (Throwable th) {
            System.out.println("erreur lors de la persistence de l'objet Langues" + l.getNom());
            throw new pfcgdcexception(th, 9);
        }
    }

    public void removeLangues(Langues l) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void updateLangues(Langues l, Integer idUtilsateurLangueModif) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Langues getLanguesById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List getLanguesByName(String nom) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List getAllListequestion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List getListequestionByName(String nom) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List getAllListereponse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List getListereponseByName(String nom) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List getAllMaterielssystemesexploitation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void addMaterielssystemesexploitation(Materielssystemesexploitation m) {
        try {
            em.persist(m);
        } catch (Throwable th) {
            System.out.println("erreur lors de la persistence de l'objet materiel et système d'exploitation" + m.getDomaine());
            throw new pfcgdcexception(th, 8);
        }
    }

    public void removeMaterielssystemesexploitation(Materielssystemesexploitation m) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void updateMaterielssystemesexploitation(Materielssystemesexploitation m, Integer idUtilsateurMSModif) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Materielssystemesexploitation getMaterielssystemesexploitationById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List getMaterielssystemesexploitationByName(String nom) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List getAllMethodologie() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void addMethodologie(Methodologie m) {
        try {
            em.persist(m);
        } catch (Throwable th) {
            System.out.println("erreur lors de la persistence de l'objet méthodologie" + m.getDomaine());
            throw new pfcgdcexception(th, 11);
        }
    }

    public void removeMethodologie(Methodologie m) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void updateMethodologie(Methodologie m, Integer idUtilsateurMethoModif) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Methodologie getMethodologieById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List getMethodologieByName(String nom) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List getAllModelisation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void addModelisation(Modelisation m) {
        try {
            em.persist(m);
        } catch (Throwable th) {
            System.out.println("erreur lors de la persistence de l'objet modélisation" + m.getDomaine());
            throw new pfcgdcexception(th, 11);
        }
    }

    public void removeModelisation(Modelisation m) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void updateModelisation(Modelisation m, Integer idUtilsateurModelModif) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Modelisation getModelisationById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List getModelisationByName(String nom) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List getAllNotification() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void addNotification(Notification n) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void removeNotification(Notification n) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void updateNotification(Notification n) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Notification getNotificationById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List getNotificationByName(String nom) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List getAllOutils() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void addOutils(Outils o) {
        try {
            em.persist(o);
        } catch (Throwable th) {
            System.out.println("erreur lors de la persistence de l'objet outil" + o.getDomaine());
            throw new pfcgdcexception(th, 9);
        }
    }

    public void removeOutils(Outils o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void updateOutils(Outils o, Integer idUtilsateurOutilModif) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Outils getOutilsById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List getOutilsByName(String nom) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List getAllProil() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void addProfil(Profil p) {

        try {
            em.persist(p);
        } catch (Throwable th) {
            System.out.println("erreur lors de l'ajout du profil");
            throw new pfcgdcexception(th, 5);
        }

    }

    public void removeProfil(Profil p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void updateProfil(Profil p, Integer idCandidatAmodifProfil) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Profil getProfilById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List getProfilByCompetence(String x, String y, String z) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List getProfilByCompetenceFonctionnelle(String x, String y, String z) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List getAllProfilgl() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void addProfilgl(Profilgl p) {
        try {
            em.persist(p);
        } catch (Throwable th) {
            System.out.println("erreur lors de l'ajout du profilGl");
            throw new pfcgdcexception(th, 5);
        }
    }

    public void removeProfilgl(Profilgl p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void updateProfilgl(Integer idUtilsateurProfilglModif) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Profilgl getProfilglById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List getProfilglByName(String nom) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List getAllQuestionsFi(Fichedetest f) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List getAllAnswersFi(Fichedetest f) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String loginControl(String login, String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

//Créer un utilisateur de type candidat ayant un profil gl
    @Override
    public boolean ajoutUtilisateurCandidatProfilGl(Users u, Profil profil, Profilgl profilgl, Candidat candidat, Formation f1, Formation f2, Formation f3, Bdd bdd1, Bdd bdd2, Bdd bd3, Materielssystemesexploitation mat1, Materielssystemesexploitation mat2, Materielssystemesexploitation mat3, Methodologie meth1, Methodologie meth2, Methodologie meth3, Modelisation modl1, Modelisation model2, Modelisation model3, Outils outil1, Outils outils2, Outils outil3, Langages langage1, Langages langage2, Langages laangage3, Langues langue1, Langues langue2, Langues langue3, Experiencesprofessionnelles exp1, Experiencesprofessionnelles exp2, Experiencesprofessionnelles exp3) {

        if (ceUsernameEstIlUtiliseDeja(u.getUsername()) == false && u.getUsername() != null) {
           
                //il est un utilisateur
                addUtilisateur(u);
                //il a un profil
                addProfil(profil);
                //Son profil est de type GL
                profilgl.setIdTypeDeProfil(profil.getIdTypeDeProfil());
                profilgl.setProfil(profil);//pour régler les conflits de relation pouvant subvenir entre profil et profil gl oneTOone
                addProfilgl(profilgl);
                //l'utilisateur est un candidat
                candidat.setUsername(u.getUsername());
                candidat.setIdTypeDeProfil(profil);//pour régler les conflits de relation pouvant subvenir
                candidat.setUsers(u);//pour régler les conflits de relation pouvant subvenir
                addCandidat(candidat);
                //Formations du candidat
                f1.setIdTypeDeProfil(profilgl.getIdTypeDeProfil());
                if (f1.getNomDiplome() == null) {
                    f1.setNomDiplome("default1");
                }
                addFormation(f1);
                f2.setIdTypeDeProfil(profilgl.getIdTypeDeProfil());
                if (f2.getNomDiplome() == null) {
                    f2.setNomDiplome("default2");
                }
                addFormation(f2);
                f3.setIdTypeDeProfil(profilgl.getIdTypeDeProfil());
                if (f3.getNomDiplome() == null) {
                    f3.setNomDiplome("default3");
                }
                addFormation(f3);
                //les bases de données
                bdd1.setIdTypeDeProfil(profilgl.getIdTypeDeProfil());
                if (bdd1.getDomaine()== null) {
                    bdd1.setDomaine("default1");
                }
                addBdd(bdd1);
                 bdd2.setIdTypeDeProfil(profilgl.getIdTypeDeProfil());
                if (bdd2.getDomaine()== null) {
                    bdd2.setDomaine("default2");
                }
                addBdd(bdd2);
                 bd3.setIdTypeDeProfil(profilgl.getIdTypeDeProfil());
                if (bd3.getDomaine()== null) {
                    bd3.setDomaine("default3");
                }
                addBdd(bd3);

                return true;
                
        } else {
            System.out.println("=============>>>" + u.getUsername() + " est dèja utilisé. Merci de choisir un autre username!");
        }
        return false;
    }

}
