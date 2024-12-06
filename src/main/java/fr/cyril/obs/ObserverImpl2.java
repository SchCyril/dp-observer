package fr.cyril.obs;

import java.util.ArrayList;
import java.util.List;

public class ObserverImpl2 implements Observer {
    private List<Integer> history = new ArrayList<>();
    @Override
    public void update(Observable observable) {
        if(observable instanceof ObservableImpl) {
            int state = ((ObservableImpl) observable).getState();
            System.out.println("------obs 2-------");
            history.add(state);
            double sum = 0;
            for(Integer s : history) {
                sum= sum + s;

            }
            System.out.println("stage avg = " + (sum/history.size()));
        }

    }
}