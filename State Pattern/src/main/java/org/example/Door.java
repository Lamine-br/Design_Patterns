package org.example;

public class Door {
    final Open OPEN = new Open();
    final Closed CLOSED = new Closed();
    final Opening OPENING = new Opening();
    final Closing CLOSING = new Closing();
    final StayOpen STAYOPEN = new StayOpen();
    State state;

    public Door(State s){
        this.state = s ;
    }

    public void touch(){
        this.state.touch(this);
    }
    public void timeOut(){
        this.state.timeOut(this);
    }
    public void complete(){
        this.state.complete(this);
    }

    public void setState(State state) {
        this.state = state;
    }
}
