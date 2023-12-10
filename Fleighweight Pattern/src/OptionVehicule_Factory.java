import java.util.*;

public class OptionVehicule_Factory {

    Map<String,Shared_OptionVehicule_Fleighweight> options ;

    public OptionVehicule_Factory(Map<String, Shared_OptionVehicule_Fleighweight> options) {
        this.options = new TreeMap<String, Shared_OptionVehicule_Fleighweight>() ;
    }

    public Map<String, Shared_OptionVehicule_Fleighweight> getOptions() {
        return options;
    }

    public void setOptions(Map<String, Shared_OptionVehicule_Fleighweight> options) {
        this.options = options;
    }

    public Shared_OptionVehicule_Fleighweight getFleighweight(String nom){
        return this.options.get(nom) ;
    }
}
