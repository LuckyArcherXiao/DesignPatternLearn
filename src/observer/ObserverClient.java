package observer;

/**
 * 主题发生变化，发送给主题内集合保存的观察者
 */
public class ObserverClient {
    public static void main(String[] args) {

        ConcreteSubject concreteSubject = new ConcreteSubject();
        ConcreteObserver concreteObserver = new ConcreteObserver();
        ConcreteObserver c2 = new ConcreteObserver();
        concreteSubject.addObserver(concreteObserver);
        concreteSubject.addObserver(c2);
        concreteSubject.doSomething();

    }
}
