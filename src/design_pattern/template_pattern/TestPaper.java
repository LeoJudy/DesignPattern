package design_pattern.template_pattern;

abstract class TestPaper {

    abstract String getName();
    abstract String getAnswer1();
    abstract String getAnswer2();
    abstract String getAnswer3();

    void doQeustion1(){
        System.out.println("杨过得到，后来给了郭靖，练成倚天剑，屠龙刀的玄铁可能是：\n a. 球墨铸铁  b, 马口铁  c. 高速合金钢  d. 碳素纤维");
        System.out.println(getName() + ": " + getAnswer1());
    }

    void doQeustion2(){
        System.out.println("杨过程英陆无双铲除了情花，造成：\n a. 这种植物不再害人  b, 一种珍惜植物灭绝  c. 破坏了当地的生态圈  d. 造成当地沙漠化");
        System.out.println(getName() + ": " + getAnswer2());
    }

    void doQeustion3(){
        System.out.println("蓝凤凰造成华山师徒、桃谷六仙呕吐不止，如果你是大夫，会给他们开什么药：\n a. 阿司匹林  b, 牛黄解毒片  c. 氟哌酸  d. 不治了");
        System.out.println(getName() + ": " + getAnswer3());
    }

    void test(){
        doQeustion1();
        doQeustion2();
        doQeustion3();
    }

}
