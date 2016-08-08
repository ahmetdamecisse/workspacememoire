import com.gdc.test.dao.Idao;
import com.gdc.test.jpa.*;
import java.util.Date;
import java.util.List;
import javax.naming.NamingException;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author a618092
 */
public class redigercv {

    private static Idao dao;

    @BeforeClass
    public static void init() throws NamingException {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config-dao.xml");
        dao = (Idao) ctx.getBean("dao");
    }

    @Test
    public void ajoutUtilisateurCandidatProfilGl() {

        Users user1 = new Users("doudou5", "CISSE", "kDoudou", "KM", "doudou@gmail.com", "771047524", "doudou5", "IGL", new Date(1990, 11, 20), Short.parseShort("1"), 1);

        if (dao.ceUsernameEstIlUtiliseDeja(user1.getUsername())==false) {
            dao.addUtilisateur(user1);

            Profil profil = new Profil(null);
            dao.addProfil(profil); // à ne pas upprimer car ça permet d'avoir l'id du profil du candidat à crée
            System.out.println("******************************************************************************");
            System.out.println("Apres persisyence de profil " + profil);

            Profilgl profilgl1 = new Profilgl(profil.getIdTypeDeProfil());
            System.out.println("******************************************************************************");
            System.out.println("Avant persisyence de profil gl " + profilgl1);

            profilgl1.setProfil(profil);//pour régler les conflits de relation pouvant subvenir entre profil et profil gl oneTOone
            dao.addProfilgl(profilgl1);//persistence du profil gl

            Bdd bdd = new Bdd(profilgl1.getIdTypeDeProfil());//la base de donneees à persister
            bdd.setProfilgl(profilgl1);//pour régler les conflits de relation pouvant subvenir entre bdd et profil gl oneTOone
            dao.addBdd(bdd);//persistence de la bdd (commentaire valide pour tous le reste des composants de profilGL)

            Candidat candidat = new Candidat(user1.getUsername());
            candidat.setIdTypeDeProfil(profil);//pour régler les conflits de relation pouvant subvenir
            candidat.setUsers(user1);//pour régler les conflits de relation pouvant subvenir
            dao.addCandidat(candidat);
        }
        else
            System.out.println("==========================Ce username est dèja utilisé!!!");
    }

//    @Test
//    public void existenceDunUsername() {
//        String reponse = dao.ceUsernameEstIlUtiliseDeja("DOUdou55");
//        System.out.println("//////////////////"+reponse);
//    }

    /*   @Test
     public void tousLesUtilisateurs() {
     // affichage les utilisateurs
     List<Users> users = dao.getALLutilisateur();
        
     System.out.println("******************************************************************************");
     System.out.println("******************************************************************************");
     System.out.println("******************************************************************************");
        
     System.out.println("*********************Lies des utilisateurs******************************");
         
     System.out.println(users);
     }                    */
}