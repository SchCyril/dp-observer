package fr.cyril.obs;

public class ObserverImpl1 implements Observer {
    @Override
    public void update(int state) {
        int state = ((ObservableImpl) state).getState();
        System.out.println("**** Obs 1*****");
        System.out.println("State Value = " + state);
    }
}
