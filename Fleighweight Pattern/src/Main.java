import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        Map<String,Shared_OptionVehicule_Fleighweight> options= new TreeMap<String,Shared_OptionVehicule_Fleighweight>();
        Shared_OptionVehicule_Fleighweight f1 = new Shared_OptionVehicule_Fleighweight("f1", "jgsuifagukzgk");
        Shared_OptionVehicule_Fleighweight f2 = new Shared_OptionVehicule_Fleighweight("f2", "jgsuifagukzgk");
        options.put(f1.getNom(),f1);
        options.put(f2.getNom(),f2);
        OptionVehicule_Factory fct = new OptionVehicule_Factory(options);
        VehiculeCommandé vehicule = new VehiculeCommandé(fct);
        vehicule.ajouterOption("f1","26526");
        vehicule.ajouterOption("f2","287265");
        vehicule.afficher();

    }
}