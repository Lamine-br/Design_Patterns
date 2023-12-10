import jdk.jshell.execution.Util;

public class  Utilisateur {
    private int id ;
    private String name ;
    private String message ;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public String getMessage() {
        return message;
    }

    public Utilisateur(int id, String name, String message) {
        this.id = id;
        this.name = name;
        this.message = message;
    }

    public void Envoyer(Utilisateur u){
        Mediator m = new Mediator();
        m.Afficher(this,u);
    }
}
