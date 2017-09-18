package design_pattern.observer_pattern;

interface Subscriber {
    void update(Publisher publisher, Object ... args);
}
