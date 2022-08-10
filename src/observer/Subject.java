package observer;

import java.util.ArrayList;
import java.util.List;

public  abstract class Subject {

    private List<Observer> observerList = new ArrayList<>();

    public void addObserver(Observer observer){
        observerList.add(observer);
    }
    public void deleteObserver(Observer observer){
        observerList.remove(observer);
    }

    public void notifyObserver(){
        for (Observer observer : observerList) {
            observer.update();
        }

    }

}
