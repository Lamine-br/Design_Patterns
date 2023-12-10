package org.example;

import java.util.ArrayList;

public abstract class Subject {
    ArrayList<Observer> observateurs = new ArrayList<>();

    public void ajouter(Observer o){
        this.observateurs.add(o);
    }
    public void supprimer(Observer o){
        this.observateurs.remove(o);
    }
    public void notifier(){
        for (int i = 0; i < this.observateurs.size(); i++) {
            this.observateurs.get(i).update((Flower) this);
        }
    }
}
