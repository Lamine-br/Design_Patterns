package org.example;

public class HummingBird implements Observer{
    String etat ;

    public HummingBird(String c){
        this.etat = c ;
    }
    public void update(Flower f) {
        this.etat = f.getEtat();
        if(etat=="ouverte"){
            System.out.println("c'est l'heure de manger");
        }
        if(etat=="fermée"){
            System.out.println("c'est l'heure de dormir");
        }
    };
}
