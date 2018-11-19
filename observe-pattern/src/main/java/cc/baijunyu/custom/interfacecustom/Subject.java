package main.java.cc.baijunyu.custom.interfacecustom;


public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
