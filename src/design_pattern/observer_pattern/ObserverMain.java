package design_pattern.observer_pattern;


/**
 * 观察者模式， 发布订阅者模式
 * 定义了一种一对多的关系，让多个观察者同时监听某一个被观察对象，当被观察对象发生变化时，
 * 通知观察者，观察者更新自己
 */
public class ObserverMain {

    public static void main(String[] args){
        Publisher publisher = new Teacher();
        Subscriber subscriber1 = new Student("停止看小说");
        Subscriber subscriber2 = new Student("停止讲话");
        Subscriber subscriber3 = new Student("停止发呆");
        Subscriber subscriber4 = new Student("停止玩游戏");

        publisher.attach(subscriber1);
        publisher.attach(subscriber2);
        publisher.attach(subscriber3);
        publisher.attach(subscriber4);

        publisher.notifySubscriber("进教室了");
    }
}
