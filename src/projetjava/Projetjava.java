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
         evenement_service eventserv = new evenement_service();
        categorie_event_service cateventserv = new categorie_event_service();
        
         
         //ajouter evenement 
           evenement event =new evenement ("test4","test4",Timestamp.valueOf("2023-03-14 22:12:23"),Timestamp.valueOf("2023-05-14 22:10:23"),"ariana",120.0,2,"test2",1);
           eventserv.ajouterEvent(event);
           
        
           //Ajouter categorie event
            categorie_event catevent =new categorie_event ("testmehakrimi");
             //cateventserv.ajoutercatEvent(catevent);
            
        
        
           //System.out.println(eventserv.afficherevenement());
          //System.out.println( cateventserv.affichercatevent());
           
          //System.out.println(eventserv.UpdateEvent("mimi", "veryexellent", "esprit",8));
           
          //System.out.println(cateventserv.UpdatecatEvent("conference2",1)); 

          
          
          
          
          
          
          
          //event.setId_event(8);
           //System.out.println(eventserv.supprimerevent(event)); 
           
           
            //catevent.setId_cat_event(2);
          //System.out.println(cateventserv.supprimercatevent(catevent));

        
        
     
          
          
          
          
          
          
          

           //System.out.println(eventserv.findbyid(5));
          //System.out.println(cateventserv.findbyidcat(1));
           
           
           
        //extraire le nom de l'evenement    
           //String nomev;
           //nomev=eventserv.getnomevent(5);
           //System.out.println(nomev);  
           
        //extraire le nom de la categorie
           //String nom;
           //nom=cateventserv.getnomcat(1);
           //System.out.println(nom);
        
         
       
           
         //affiche lid atravers une image
         //int i ;
         //i=eventserv.findbyImage("test_meha");
        //System.out.println(i);   
           
           
        
           
           
        










            //System.out.println(eventserv.);
         //System.out.println("********************");
        //Supprimer categorie event 
         //boolean test=false;
        //test=cateventserv.supprimercatevent(catevent);
        //System.out.println(test);
         //boolean test=false;
           //test=eventserv.supprimerevent(eventserv);
          //System.out.println(test);
            
}
}
