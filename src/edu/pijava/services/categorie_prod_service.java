/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pijava.services;

import edu.pijava.model.categorie_prod;
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
public class categorie_prod_service {
    
    Statement ste;
    Connection conn = MyConnection.getInstance().getConn();
  
    
    //Mèthode pour afficher categorie produit
    
    public List<categorie_prod> affichercatprod() {
       List<categorie_prod> list = new ArrayList<>();
        try {
            String req = "Select * from categorie_prod";
            Statement st = conn.createStatement();
           
            ResultSet RS= st.executeQuery(req);
            while(RS.next()){
             categorie_prod p = new categorie_prod();
             p.setCat_prod(RS.getString("cat_prod"));
             
list.add(p);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return list;
    }
    
      //Mèthode pour ajouter produit
     public void ajoutercatprod(categorie_prod c) {
        try {
            ste = conn.createStatement();
            String requeteInsert = "INSERT INTO `categorie_prod`(`cat_prod`) VALUES (?)";
            PreparedStatement pst = conn.prepareStatement(requeteInsert);
            pst.setString(1, c.getCat_prod());
            
 if (pst.executeUpdate() != 0) {
                System.out.println("Catégorie produit added");
            }
        } catch (SQLException ex) {
            Logger.getLogger(evenement_service.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
  
    
      
           
           
           
      //Mèthode pour supprimer categorie produit 
    public boolean supprimercatprod(categorie_prod cp) {

        String reqeute = "delete from categorie_prod where (id_cat_prod = ?) ;";
        try {
            PreparedStatement pst = conn.prepareStatement(reqeute);
            pst.setInt(1, cp.getId_cat_prod());
            
            if (pst.executeUpdate() != 0) {
                System.out.println("categorie prod  supprimé");
            }
            return true;
        } catch (SQLException ex) {
System.out.println(ex.getMessage());

        }

        return false;
    }
    
    
    //Mèthode pour modifier categorie produit
    public void modifiercatprod(categorie_prod c) {
        try {
            String req = "UPDATE `categorie_prod` SET `cat_prod` = '" + c.getCat_prod() + "' WHERE `personne`.`id_cat_prod` = " + c.getId_cat_prod();
            Statement st = conn.createStatement();
            st.executeUpdate(req);
            System.out.println("catégorie produit updated !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    

}