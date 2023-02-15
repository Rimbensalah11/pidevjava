/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjava;
import edu.pijava.model.*;
import edu.pijava.services.*;
import edu.pijava.utils.MyConnection;
import java.sql.Connection;
import java.sql.Timestamp;
/**
 *
 * @author rimbs
 */
public class Projetjava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Connection conn = MyConnection.getInstance().getConn();
       
        
        produit_service prod = new produit_service();
        categorie_prod_service cat = new categorie_prod_service();
        
        //Afficher  categorie produit 
          //categorie_prod_service c1 = new categorie_prod_service ();
          //System.out.println(c1.affichercatprod());
          
        //Afficher produit
             //produit_service p1 = new produit_service ();
            //System.out.println(p1.afficherprod());
            
            
        
        
        //Ajouter produit 
            produit p =new produit ("rim","test",8,100,"test",1,"test");
            prod.ajouterprod(p);
            
           System.out.println(prod.findbyid(6));
        
        //Supprimer produit 
            //boolean test=false;
            //test=prod.supprimerprod(p);
            //System.out.println(test);
        
        
           //Ajouter categorie produit 
           categorie_prod cat_prod =new categorie_prod ("testtest");
           // cat.ajoutercatprod(cat_prod);
            
        //Supprimer categorie produit 
         //   boolean test=false;
            //test=cat.supprimercatprod(cat_prod);
          //  System.out.println(test);
            
            System.out.println();
            //System.out.println(prod.findbyid(1));
            
            
     // categorie_prod cat_prod =new categorie_prod ("testrim");
      System.out.println(cat.findbyid(2));
      String nom;
      nom=prod.getNom_prod(6);
      System.out.println(nom);
      //test getCat_prod 
      String nomcat;
      nomcat=cat.getCat_prod(6);
      System.out.println(nomcat);
      //declartion d'une variable qui recoit id de l'image 
      int id;
      id=prod.findbyImage("test");
      System.out.println(prod.findbyImage("test"));
        System.out.println(id);
      //on set l'id pour q'on puisse supprimer car on a auto increment d'id par defaut
        p.setId_prod(8);
        System.out.println(prod.supprimerprod(p));
        
        cat_prod.setId_cat_prod(6);
        System.out.println(cat.supprimercatprod(cat_prod));
        

        System.out.println(prod.updateprod("meha", "test", 100,7 ));
        
        System.out.println(cat.updatecatprod("boisson", 5));
            
            
            
          
            
            
}
}
