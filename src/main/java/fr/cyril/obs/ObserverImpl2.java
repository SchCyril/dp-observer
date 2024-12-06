package fr.cyril.obs;

import java.util.ArrayList;
import java.util.List;

public class ObserverImpl2 implements Observer {
    private List<Integer> history = new ArrayList<>();
    @Override
    public void update(int newState) {
        history.add(newState);
        double sum = 0;
        for (Integer i : history) {
            sum += history.get(i);
        }
        System.out.println("Moyenne = " +sum/history.size());

    }
}
