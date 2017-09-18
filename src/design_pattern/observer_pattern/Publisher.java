package design_pattern.observer_pattern;

public interface Publisher {

    void attach(Subscriber subscriber);
    void detach(Subscriber subscriber);
    void notifySubscriber(String thing);
}
