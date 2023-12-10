package org.example;

public class Main {
    public static void main(String[] args) {

        State state = new Open();
        Door d = new Door(state);
        System.out.println(""+d.state.getClass());
        d.touch();
        System.out.println(""+d.state.getClass());
    }
}