package Tests;

import entities.DemandeStage;
import entities.OffreDeStage;
import services.ServiceDemandeStage;
import services.ServiceOffreStage;

import java.sql.Array;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) throws SQLException {
        ServiceDemandeStage serviceDemandeStage = new ServiceDemandeStage();
//       ServiceDemandeStage serviceDemandeStage = new ServiceDemandeStage();
        LocalDateTime dateTime = LocalDateTime.now();
//        DemandeStage demandeStage = new DemandeStage(1,"khaloui","achref","khalouiachref@gmail.com","hahahahahhahahahhaha","yesser.com","informatique",25114365);
//       demandeStage.setEtat("accepter");
//        seviceDemandeStage.ajouter(demandeStage);
       // serviceDemandeStage.afficheUne(5);
       // serviceDemandeStage.modifier(demandeStage);
//        List <String> list = new ArrayList<>();
//        list.add("français");
//        OffreDeStage offreDeStage = new OffreDeStage("hello","informatique","stage",5,"2ans","Hello World !","bonjour");
        ServiceOffreStage serviceOffreStage = new ServiceOffreStage();
//        serviceOffreStage.ajouter(offreDeStage);
//            serviceOffreStage.supprimer(8);
        serviceOffreStage.afficher();
    }
}
