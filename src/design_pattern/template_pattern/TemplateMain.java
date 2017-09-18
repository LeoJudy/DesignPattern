package design_pattern.template_pattern;


/**
 * 模板方法模式
 * 定义一个操作中的算法骨架，而将一些步骤延迟到子类中，模板方法使得子类
 * 可以不改变一个算法的结构即可重定义该算法的某些特定步骤
 *
 * 我们所用的 app 开发框架， Spring MVC, MFC 等，都是模板方法模式的体现。
 */
public class TemplateMain {


    public static void main(String[] args){
        TestPaper testPaper1 = new TestStudent1();
        TestPaper testPaper2 = new TestStudent2();
        TestPaper testPaper3 = new TestStudent3();

        testPaper1.test();
        testPaper2.test();
        testPaper3.test();
    }
}
