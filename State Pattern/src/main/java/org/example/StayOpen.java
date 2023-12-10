package org.example;

public class StayOpen implements State{
    public void touch(Door d){
        d.setState(d.CLOSING);
    }
    public void timeOut(Door d){

    }
    public void complete(Door d){

    }
}
