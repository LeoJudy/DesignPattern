package design_pattern.builder_pattern;


/**
 * 建造者模式：
 * 将一个复杂对象的构建和其表示分离，使得同样的构建过程可以创建不同的表示
 *
 * 并且可以提供默认值， 构建过程中函数直接返回构建者本身还可以达到链式
 * 表达的效果
 */
public class BuilderMain {

    public static void main(String[] args){
        Person person = new PersonBuilder()
                .setBody("盖世无双胸甲")
                .setHead("盖世无双头盔")
                .setRightHand("盖世无双匕首")
                .setLeftLeg("邹康的左腿暗器")
                .setRightLeg("大壮的右腿刺刀")
                .build();

        System.out.println(person);
    }
}
