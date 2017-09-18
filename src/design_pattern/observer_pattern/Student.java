package design_pattern.observer_pattern;

public class Student implements Subscriber {

    Student(String update){
        this.update = update;
    }

    private String update;

    @Override
    public void update(Publisher publisher, Object... args) {
        System.out.println(toString() + update);
    }

    @Override
    public String toString() {
        return "学生[" + hashCode() + "]";
    }
}
