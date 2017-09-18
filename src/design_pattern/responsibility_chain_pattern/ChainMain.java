package design_pattern.responsibility_chain_pattern;

/**
 * 职责链模式：使多个对象都有机会处理请求，从而避免请求的发送者和接受者之间的耦合关系，将这些处理对象连成一条链，
 * 并沿着这条链传递请求，直到有一个对象处理这个请求为止。
 *
 * 考虑 android 的 onTouchEvent 的传递
 */
public class ChainMain {
    public static void main(String[] args){
        Event event1 = new Event(Event.EVENT_TYPE.TYPE1);
        Event event2 = new Event(Event.EVENT_TYPE.TYPE2);
        Event event3 = new Event(Event.EVENT_TYPE.TYPE3);

        EventHandler handler1 = new EventHandler1();
        EventHandler handler2 = new EventHandler2();
        EventHandler handler3 = new EventHandler3();
        handler1.addSubHandler(handler2);
        handler2.addSubHandler(handler3);

        handler1.dispatchEvent(event1);
        handler1.dispatchEvent(event2);
        handler1.dispatchEvent(event3);
    }
}
