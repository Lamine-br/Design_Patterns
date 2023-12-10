package org.example;

public class Bee implements Observer{
    String etat ;

    public Bee(String c){
        this.etat = c ;
    }
    public void update(Flower f){
        this.etat = f.getEtat() ;
        if(etat=="ouverte"){
            System.out.println("c'est l'heure de manger");
        }
        if(etat=="fermée"){
            System.out.println("c'est l'heure de dormir");
        }
    }
}
