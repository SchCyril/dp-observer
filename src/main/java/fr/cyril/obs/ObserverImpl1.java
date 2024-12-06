package fr.cyril.obs;

public class ObserverImpl1 implements Observer {
    @Override
    public void update(int newState) {
        System.out.println("**** Obs 1*****");
        System.out.println("New State Value = " + newState);
    }
}
