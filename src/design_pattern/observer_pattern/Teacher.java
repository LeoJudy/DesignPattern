package design_pattern.observer_pattern;

import java.util.HashSet;
import java.util.Set;

public class Teacher implements Publisher{
    private Set<Subscriber> subscriberList = new HashSet<>();

    @Override
    public void attach(Subscriber subscriber) {
        subscriberList.add(subscriber);
    }

    @Override
    public void detach(Subscriber subscriber) {
        subscriberList.remove(subscriber);
    }

    @Override
    public void notifySubscriber(String thing) {
        System.out.println("老师" + thing);
        for(Subscriber subscriber:subscriberList){
            subscriber.update(this, thing);
        }
    }
}
