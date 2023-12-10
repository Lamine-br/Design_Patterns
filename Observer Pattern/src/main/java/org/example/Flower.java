package org.example;

public class Flower extends Subject{
    private String etat ;

    public String getEtat(){
        return etat ;
    }
    public void setEtat(String s){
        etat = s ;
        super.notifier();
    }
}
