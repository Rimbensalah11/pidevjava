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
 
 */
public class Projetjava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Connection conn = MyConnection.getInstance().getConn();
       
        
          //categorie_event_service cateventserv = new categorie_event_service();
           //System.out.println( cateventserv.affichercatevent());
           
           evenement_service eventserv = new evenement_service();
           categorie_event_service  cateventserv = new categorie_event_service(); 
         //  System.out.println(eventserv.afficherevenement());
          // System.out.println(eventserv.findbyid(1));
         System.out.println("********************");
         //String nom;
         //nom=cateventserv.getnomcat(1);
           //System.out.println(nom);
           
           //String nomev;
         //nomev=eventserv.getnomevent(1);
           //System.out.println(nomev);
           
           
           
           
           //affiche lid atravers une image
           int i ;
           i=eventserv.findbyImage("test_meha");
           System.out.println(i);
           
           
          // System.out.println(eventserv.);

            
             //System.out.println(cateventserv.findbyidcat(1));

    
           evenement event =new evenement ("test","test",Timestamp.valueOf("2023-02-14 22:10:23"),Timestamp.valueOf("2023-02-14 22:10:23"),"tunis",100.0,1,"test",1);
           eventserv.ajouterEvent(event);
          // boolean test=false;
          event.setId_event(2);
          //System.out.println(eventserv.supprimerevent(event));
          

           
           //test=eventserv.supprimerevent(eventserv);
           //System.out.println(test);
          
           //Ajouter categorie event
           // categorie_event_service  cateventserv = new categorie_event_service();
            categorie_event catevent =new categorie_event ("testmeha");
            
           // ces.ajoutercatEvent(catevent);
          catevent.setId_cat_event(2);
          System.out.println(cateventserv.supprimercatevent(catevent));
           
          
          //boolean test=false;
          //System.out.println(eventserv.UpdateEvent("meha", "exellent", "esprit",1));
          System.out.println(cateventserv.UpdatecatEvent("conference",1));  
        //Supprimer categorie event 
           // boolean test=false;
            //test=cateventserv.supprimercatevent(catevent);
            //System.out.println(test);
            
}
}
