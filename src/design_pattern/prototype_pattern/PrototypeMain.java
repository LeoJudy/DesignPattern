package design_pattern.prototype_pattern;


/**
 * 原型模式：
 * 当需要一个类的实例，但这个实例的大部分内容是相同的的时候，可以尝试使用
 * 原型模式，我们克隆之后，改掉其中很少的一部分就可以直接进行使用，而不用
 * 再次初始化。
 *
 * 原型模式需要注意的一个问题是，当原型中含有某一个类，我们是否应该把这个
 * 类同样做一份拷贝，还是只需要拷贝其引用，这是根据业务逻辑确定的, C++
 * （拷贝构造函数， 赋值构造函数）处理这个问题的时候，还需要考虑析构函数
 * 是否会将同一块内存多次释放。
 *
 */
public class PrototypeMain {


    public static void main(String[] args){
        Box box = new Box(1, 2);
        Box[] boxes = new Box[10];
        try{
            for(int i = 0; i < boxes.length; i++){
                boxes[i] = box.clone();
            }
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        for(Box b:boxes){
            System.out.println(b);
        }
    }
}
