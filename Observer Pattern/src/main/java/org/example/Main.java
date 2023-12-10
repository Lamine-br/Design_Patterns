package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Observer o = new Bee("ouverte");
        Observer o1 = new HummingBird("fermée");
        ArrayList<Observer> l = new ArrayList<>();
        Flower s = new Flower() ;
        s.ajouter(o);
        s.ajouter(o1);
        s.setEtat("ouverte");
    }
}