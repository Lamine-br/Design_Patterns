import java.util.*;

public class VehiculeCommandé {
    Map<Shared_OptionVehicule_Fleighweight,String> options_vehicule ;

    OptionVehicule_Factory options ;

    public VehiculeCommandé(OptionVehicule_Factory fct) {
        this.options_vehicule = new TreeMap<Shared_OptionVehicule_Fleighweight, String>() ;
        this.options = fct ;
    }
    public VehiculeCommandé(Map<Shared_OptionVehicule_Fleighweight, String> vehicules, OptionVehicule_Factory options) {
        this.options_vehicule = vehicules;
        this.options = options;
    }

    public Map<Shared_OptionVehicule_Fleighweight, String> getVehicules() {
        return options_vehicule;
    }

    public void setVehicules(Map<Shared_OptionVehicule_Fleighweight, String> vehicules) {
        this.options_vehicule = vehicules;
    }

    public void ajouterOption(String nom, String prix){
        this.options_vehicule.put(this.options.getOptions().get(nom),prix);
    }

    public void afficher(){
        for (Shared_OptionVehicule_Fleighweight i: this.options_vehicule.keySet()) {
            i.afficher();
            this.options_vehicule.get(i);
        }
    }
}
