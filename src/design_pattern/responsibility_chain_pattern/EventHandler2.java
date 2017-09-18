package design_pattern.responsibility_chain_pattern;

public class EventHandler2 extends EventHandler{

    @Override
    boolean handleEvent(Event event) {
        return event.eventType == Event.EVENT_TYPE.TYPE2;
    }

    @Override
    boolean handle(Event event) {
        System.out.println(getClass().getSimpleName() + " handled the event " + event);
        return true;
    }
}
