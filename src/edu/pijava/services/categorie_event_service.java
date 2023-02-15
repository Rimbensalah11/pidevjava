/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pijava.services;

import edu.pijava.model.categorie_event;
import edu.pijava.model.produit;
import edu.pijava.utils.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rimbs
 */
public class categorie_event_service {
     Statement ste;
    Connection conn = MyConnection.getInstance().getConn();
    
   //Mèthode pour afficher categorie event
    public List<categorie_event> affichercatevent() {
       List<categorie_event> list = new ArrayList<>();
        try {
            String req = "Select * from categorie_event";
            Statement st = conn.createStatement();
           
            ResultSet RS= st.executeQuery(req);
            while(RS.next()){
             categorie_event ce = new categorie_event();
             ce.setId_cat_event(RS.getInt("id_cat_event"));
             ce.setCat_event(RS.getString("cat_event"));
             


list.add(ce);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return list;
    }
    
       //Mèthode pour supprimer event
    public boolean supprimercatevent(categorie_event ce) {

        String reqeute = "delete from categorie_event where (id_cat_event = ?) ;";
        try {
            PreparedStatement pst = conn.prepareStatement(reqeute);
            pst.setInt(1, ce.getId_cat_event());
            if (pst.executeUpdate() != 0) {
                System.out.println("Categorie evenement supprimé");
            }
            return true;
        } catch (SQLException ex) {
System.out.println(ex.getMessage());

        }

        return false;
    }
    
    
    public void ajoutercatEvent(categorie_event ce) {
        try {
            ste = conn.createStatement();
            String requeteInsert = "INSERT INTO categorie_event (cat_event) VALUES (?)";
            PreparedStatement pst = conn.prepareStatement(requeteInsert);
            pst.setString(1, ce.getCat_event());
           
 if (pst.executeUpdate() != 0) {
                System.out.println("Categorie evenement added");
            }
        } catch (SQLException ex) {
            Logger.getLogger(categorie_event_service.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
