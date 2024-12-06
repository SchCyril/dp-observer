package fr.cyril.obs;

public interface Observer {
    // void update(int state); // push

    void update(Observable o); // pop
}
