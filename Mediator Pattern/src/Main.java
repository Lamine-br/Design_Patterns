public class Main {
    public static void main(String[] args) {

        Utilisateur u1 = new Utilisateur(1,"lamine","Arwh ejri") ;
        Utilisateur u2 = new Utilisateur(2,"chemsou","Esbr") ;
        u1.Envoyer(u2);
        u2.Envoyer(u1);
    }
}