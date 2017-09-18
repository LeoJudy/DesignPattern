package design_pattern.decorator_pattern;

/**
 *
 * 装饰者模式实现模型：
 * 首先需要一个行为 如 InputStream.
 * 然后需要一个具体实现, 如 FileInputStream
 * 然后一个抽象的装饰者实现行为接口，并拥有行为的一个具体实例 DataInputStream
 * 然后将具体实现注入到装饰者，装饰者增加新的功能 ObjectInputStream
 * 可以一直添加新功能
 *
 * @see java.io.InputStream
 */
public class DecoratorMain {

    public static void main(String[] args){

        Number1Wisdom wisdom = new Number1Wisdom(new Number1Healthy(new Number1Handsome(new Person())));
        wisdom.brag();

    }
}
