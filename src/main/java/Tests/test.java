package Tests;

import entities.DemandeStage;
import services.ServiceDemandeStage;

import java.sql.SQLException;
import java.time.LocalDateTime;

public class test {
    public static void main(String[] args) throws SQLException {
        ServiceDemandeStage serviceDemandeStage = new ServiceDemandeStage();
//       ServiceDemandeStage serviceDemandeStage = new ServiceDemandeStage();
        LocalDateTime dateTime = LocalDateTime.now();
//        DemandeStage demandeStage = new DemandeStage(1,"khaloui","achref","khalouiachref@gmail.com","hahahahahhahahahhaha","yesser.com","informatique",25114365);
//       demandeStage.setEtat("accepter");
//        seviceDemandeStage.ajouter(demandeStage);
        serviceDemandeStage.afficheUne(5);
       // serviceDemandeStage.modifier(demandeStage);

    }
}
