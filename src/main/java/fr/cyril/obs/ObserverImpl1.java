package fr.cyril.obs;

public class ObserverImpl1 implements Observer {

    // Push
    /*@Override
    public void update(int newState) {
        System.out.println("**** Obs 1*****");
        System.out.println("New State Value = " + newState);
    }*/

    // PULL
    public void update(Observable observable) {
        if(observable instanceof ObservableImpl obs) {
            System.out.println("**** Obs 1*****");
            System.out.println("New State Value = " + obs.getState());
        }

    }
}
