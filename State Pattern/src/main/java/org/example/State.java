package org.example;

public interface State {
    public void touch(Door d);
    public void timeOut(Door d);
    public void complete(Door d);
}
