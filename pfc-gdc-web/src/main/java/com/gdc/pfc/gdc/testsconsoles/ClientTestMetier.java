/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdc.pfc.gdc.testsconsoles;

//import com.gdc.pfc.gdc.services.Imetier;
//import com.gdc.test.jpa.Users;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author a618092
 */
public class ClientTestMetier {

    public static void main(String[] args) {

        System.out.println("ghfdvfrfhbg'trfgvbghfvjhgfvn");
        System.out.println("ghfdvfrfhbg'trfgvbghfvjhgfvn");
        System.out.println("ghfdvfrfhbg'trfgvbghfvjhgfvn");
        try {
            ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config-metier-dao.xml");
      //      Imetier metier = (Imetier) ctx.getBean("metier");
            // affichage les utilisateurs
     //       List<Users> users = metier.getALLutilisateur();
            System.out.println("******************************************************************************");
            System.out.println("*********************couche métier: Lies des utilisateurs******************************");
        //    System.out.println(users);
        } catch (Throwable ex) {
            System.out.println("Erreur++++++++++++++++++++++++++++++++++++++++++++++++++++");
            while (ex != null) {
                System.out.println(String.format("%s : %s", ex.getClass().getName(), ex.getMessage()));
                ex = ex.getCause();
            }
        }
    }
}
