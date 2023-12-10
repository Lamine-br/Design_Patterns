package org.example;

public class Closing implements State{
    public void touch(Door d){

    }
    public void timeOut(Door d){

    }
    public void complete(Door d){
        d.setState(d.CLOSED);
    }
}
