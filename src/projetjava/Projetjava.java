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
        
        //Afficher  categorie produit (oui)
          categorie_prod_service c1 = new categorie_prod_service ();
          System.out.println(c1.affichercatprod());
          
        //Afficher produit (oui)
          produit_service p1 = new produit_service ();
          System.out.println(p1.afficherprod());
            
            
        
        //Ajouter produit (temchi)
       //  produit p =new produit ("rim","test",8,100,"test",1,"test");
          //  prod.ajouterprod(p);
            //System.out.println(prod.findbyid(14));
        
        //Supprimer produit (non)
        // boolean test=false;
          //  test=prod.supprimerprod(p);
            //System.out.println(test);
        
        
           //Ajouter categorie produit (oui)
            categorie_prod cat_prod =new categorie_prod ("riri");
            //cat.ajoutercatprod(cat_prod);
            
        //Supprimer categorie produit (non
          // boolean test=false;
            //test=cat.supprimercatprod(cat_prod);
           //System.out.println(test);
            
           //test de findbyid produit et categorie produit
            System.out.println();
            System.out.println(prod.findbyid(12));
            System.out.println(cat.findbyid(5));

            
     // categorie_prod cat_prod =new categorie_prod ("testrim");
     
     //Test getNom_prod
      System.out.println(prod.getNom_prod(14));
      
     //test getCat_prod 
        System.out.println(cat.getCat_prod(8));
      
     //test find by image
      System.out.println(prod.findbyImage("IMG"));
      
        //System.out.println(id);
        
      // Supprimer produit on set l'id pour q'on puisse supprimer car on a auto increment d'id par defaut
       // produit p =new produit ("rim","test",8,100,"test",1,"test");
        //p.setId_prod(12);
        //System.out.println(prod.supprimerprod(p));
        
        //Supprimer categorie produit
        //categorie_prod cat_prod =new categorie_prod ("testrim");
        //cat_prod.setId_cat_prod(8);
        //System.out.println(cat.supprimercatprod(cat_prod));
         
      //modifier produit
         //System.out.println(prod.modifierprod("meha", "test", 100,14 ));
         
         
      //modifier categorie produit
        //System.out.println(cat.modifiercatprod("materiel", 1));
            
            
            
          
            
            
}
}
