public class Mediator {

    public void Afficher(Utilisateur u1, Utilisateur u2){
        System.out.println(u1.getName() + " : @"+ u2.getName() + " " + u1.getMessage());
    }
}
