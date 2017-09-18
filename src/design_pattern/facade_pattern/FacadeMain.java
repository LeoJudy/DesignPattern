package design_pattern.facade_pattern;

/**
 * 外观模式：
 * 当一个系统存在一系列复杂的可以按照既定步骤完成的事情的时候
 * 可以使用一个统一的类对这些步骤进行管理，从而达到简化客户端
 * 调用的目的。
 *
 */
public class FacadeMain {


    static void method1(){}
    static void method2(){}
    static void method3(){}

    static void method(){
        method1();
        method2();
        method3();
    }

    public static void main(String[] args){
        method();
    }
}
