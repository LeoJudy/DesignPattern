package design_pattern.responsibility_chain_pattern;

public class Event {
    public enum EVENT_TYPE{
        TYPE1,
        TYPE2,
        TYPE3
    }

    Event(EVENT_TYPE type){
        this.eventType = type;
    }

    EVENT_TYPE eventType;

    @Override
    public String toString() {
        return "" + eventType;
    }
}
