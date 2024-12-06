package fr.cyril;

import fr.cyril.obs.*;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        ObservableImpl observable = new ObservableImpl();
        Observer observer1 = new ObserverImpl1();
        Observer observer2 = new ObserverImpl2();
        observable.subscribe(observer1);
        observable.subscribe(observer2);


        // PUSH
        /*observable.subscribe(state -> {
            System.out.println("+++++++++++ Obs 3 +++++++++++");
            System.out.println("Res = " + state * Math.cos(state));
        });*/

        //PULL
        observable.subscribe(new Observer() {
                                 @Override
                                 public void update(Observable o) {
                                     if (o instanceof ObservableImpl obs) {
                                         System.out.println("+++++++++++ Obs 3 +++++++++++");
                                         System.out.println("Res = " + ((ObservableImpl) o).getState() * Math.cos(((ObservableImpl) o).getState()));
                                         System.out.println("+++++++++++ Obs 3 +++++++++++");
                                     }
                                 }
                             }
        );

        // PULL Lambda
        observable.subscribe(obs -> {
            if (obs instanceof ObservableImpl o) {
                System.out.println("+++++++++++ Obs 3 +++++++++++");
                System.out.println("Res = " + o.getState() * Math.cos(o.getState()));
                System.out.println("+++++++++++ Obs 3 +++++++++++");
            }
        });

        observable.setState(60);
        observable.setState(30);

        observable.unsubscribe(observer2);
        observable.setState(40);


    }









}

