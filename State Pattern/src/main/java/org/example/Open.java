package org.example;

public class Open implements State{
    public void touch(Door d){
        d.setState(d.STAYOPEN);
    }
    public void timeOut(Door d){
        d.setState(d.CLOSING);
    }
    public void complete(Door d){

    }
}
