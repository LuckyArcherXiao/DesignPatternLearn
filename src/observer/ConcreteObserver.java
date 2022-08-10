package observer;

/**
 * 具体观察者
 */
public class ConcreteObserver implements Observer {
    @Override
    public void update() {
        System.out.println("收到消息并处理");
    }
}
