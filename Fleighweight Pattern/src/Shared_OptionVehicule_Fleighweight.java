public class Shared_OptionVehicule_Fleighweight {

    private String Nom ;
    private String Description;

    public Shared_OptionVehicule_Fleighweight(String nom, String description) {
        Nom = nom;
        Description = description;
    }

    public String getNom() {
        return Nom;
    }

    public String getDescription() {
        return Description;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void afficher(){
        System.out.println(this.Nom);
        System.out.println(this.Description);
    }
}
