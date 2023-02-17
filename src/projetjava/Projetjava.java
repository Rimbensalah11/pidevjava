package projetjava;

import edu.pijava.model.Users;
import edu.pijava.services.UserService;
import edu.pijava.utils.MyConnection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Projetjava {
    
    public static void main(String[] args) {
        
        // Obtenir une instance de la classe MyConnection
        MyConnection mc = MyConnection.getInstance();
        MyConnection mc2 = MyConnection.getInstance();
        System.out.println(mc.hashCode()+" - "+mc2.hashCode());
        
        // Obtenir une instance de la classe UserService
        UserService userService = new UserService();
        
       // Ajouter un utilisateur
//        try {
//            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//            Date dateNaissance = sdf.parse("1993-03-23");
//            Users u2 = new Users("Moulin", "Sylvie", "moulin@gmail.com", dateNaissance, 12244554, "Organisateur");  
//            userService.ajouterUtilisateur2(u2);
//            System.out.println("Utilisateur ajouté avec succès !");
//        } catch (ParseException ex) {
//            System.err.println("Erreur de parsing : " + ex.getMessage());
//        }
//        
        // Afficher tous les utilisateurs
//        System.out.println("Liste des utilisateurs :");
//        System.out.println(userService.afficherUtilisateur());
        
        // Modifier un utilisateur existant
        Users utilisateurAModifier = userService.getUtilisateurParId(1);
        if (utilisateurAModifier != null) {
            utilisateurAModifier.setNom("Poulin");
            utilisateurAModifier.setPrenom("Eric");
            utilisateurAModifier.setEmail("eric@gmail.com");
            utilisateurAModifier.setNumTel(11111111);
            utilisateurAModifier.setUserRole("Participant");
            userService.modifierUtilisateur(utilisateurAModifier);
            System.out.println("Utilisateur modifié avec succès !");
        } else {
            System.err.println("Utilisateur non trouvé !");
        }

         //Afficher tous les utilisateurs après la modification
        System.out.println("Liste des utilisateurs après la modification :");
        System.out.println(userService.afficherUtilisateur());
    }
        
//        // Supprimer un utilisateur existant
//        Users utilisateurASupprimer = userService.getUtilisateurParId(4);
//        if (utilisateurASupprimer != null) {
//            userService.supprimerUtilisateur(utilisateurASupprimer);
//            System.out.println("Utilisateur supprimé avec succès !");
//        } else {
//            System.err.println("Utilisateur non trouvé !");
//        }
//        
//        // Afficher tous les utilisateurs après la suppression
//        System.out.println("Liste des utilisateurs après la suppression :");
//        System.out.println(userService.afficherUtilisateur());
 }






