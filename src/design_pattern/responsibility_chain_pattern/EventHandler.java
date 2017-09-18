package design_pattern.responsibility_chain_pattern;

import java.util.LinkedList;
import java.util.List;

abstract class EventHandler {

    private List<EventHandler> subHandler = new LinkedList<>();

    void addSubHandler(EventHandler handler){
        subHandler.add(handler);
    }

    abstract boolean handleEvent(Event event);
    abstract boolean handle(Event event);

    boolean dispatchEvent(Event event){
        boolean result = false;
        if (handleEvent(event)){
            result = handle(event);
        }else{
            for(EventHandler handler: subHandler){
                result = handler.dispatchEvent(event);
                if (result){
                    break;
                }
            }
        }
        return result;
    }
}
