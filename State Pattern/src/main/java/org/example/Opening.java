package org.example;

public class Opening implements State{
    public void touch(Door d){
        d.setState(d.CLOSING);
    }
    public void timeOut(Door d){

    }
    public void complete(Door d){
        d.setState(d.OPEN);
    }
}
