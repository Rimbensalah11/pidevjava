/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pijava.services;

import edu.pijava.model.categorie_prod;
import edu.pijava.model.evenement;
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
public class produit_service {
     Statement ste;
    Connection conn = MyConnection.getInstance().getConn();
  
    //Mèthode pour afficher produit
    public List<produit> afficherprod() {
       List<produit> list = new ArrayList<>();
        try {
            String req = "Select * from produit";
            Statement st = conn.createStatement();
           
            ResultSet RS= st.executeQuery(req);
            while(RS.next()){
             produit p = new produit();
             p.setId_prod(RS.getInt("id_prod"));
             p.setDescription(RS.getString("description"));
             p.setNom_prod(RS.getString("nom_prod"));
             p.setPrix(RS.getDouble("prix"));
             p.setQuantite(RS.getInt("quantite"));
             p.setNom_part(RS.getString("nom_part"));
             p.setId_cat(RS.getInt("id_cat"));


list.add(p);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return list;
    }
    
 
     //Ajouter produit 
     public void ajouterprod(produit p) {
        try {
            ste = conn.createStatement();
            String requeteInsert = "INSERT INTO `produit`( `nom_prod`, `description`, `prix`, `quantite`, `nom_part`, `id_cat`) VALUES (?,?,?,?,?,?)";
            PreparedStatement pst = conn.prepareStatement(requeteInsert);
            pst.setString(1, p.getNom_prod());
            pst.setString(2, p.getDescription());
            pst.setDouble(3,p.getPrix());
            pst.setInt(4,p.getQuantite());
            pst.setString(5, p.getNom_part());
             pst.setInt(6,p.getId_cat());
            
 if (pst.executeUpdate() != 0) {
                System.out.println("Produit added");
            }
        } catch (SQLException ex) {
            Logger.getLogger(evenement_service.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
  
     
       //Mèthode pour supprimer produit
    public boolean supprimerprod(produit p) {

        String reqeute = "delete from produit  where (id_prod = ?) ;";
        try {
            PreparedStatement pst = conn.prepareStatement(reqeute);
            pst.setInt(1, p.getId_prod());
            if (pst.executeUpdate() != 0) {
                System.out.println("produit  supprimé");
            }
            return true;
        } catch (SQLException ex) {
System.out.println(ex.getMessage());

        }

        return false;
    }
}
