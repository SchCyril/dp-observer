package fr.cyril;

import fr.cyril.obs.*;

public class Main {
    public static void main(String[] args) {
        ObservableImpl observable = new ObservableImpl();
        Observer observer1 = new ObserverImpl1();
        observable.subscribe(observer1);
        observable.subscribe(new ObserverImpl2());
        observable.setState(70);
        observable.setState(85);
        observable.setState(100);
        observable.setState(54);
        observable.setState(74);
        observable.unsubscribe(observer1);
        System.out.println("..............");
        observable.setState(44);
        observable.setState(34);

        observable.subscribe(state -> {
            System.out.println("=============");
            System.out.println("prévision = " + Math.cos(state*2)*Math.log(state*state));
        });

        observable.setState(65);

    }
}