package design_pattern.prototype_pattern;

public class Box implements Cloneable {
    private static int curId = 10000;
    private int id;
    private int size;


    Box(int id, int size){
        this.id = id;
        this.size = size;
    }

    @Override
    protected Box clone() throws CloneNotSupportedException {
        Box box = (Box)super.clone();
        box.id = curId++;
        return box;
    }

    @Override
    public String toString() {
        return "Box[id=" + id + ", size=" + size + "]";
    }
}
