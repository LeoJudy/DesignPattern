package design_pattern.responsibility_chain_pattern;

public class EventHandler1 extends EventHandler{

    @Override
    boolean handleEvent(Event event) {
        return event.eventType == Event.EVENT_TYPE.TYPE1;
    }

    @Override
    public boolean handle(Event event) {
        System.out.println(getClass().getSimpleName() + " handled the event " + event);
        return true;
    }

}
