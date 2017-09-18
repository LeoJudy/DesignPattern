package design_pattern.decorator_pattern;

public class Number1Wisdom extends Bragger{

    Number1Wisdom(NB nb){
        super(nb);
    }

    @Override
    public void brag() {
        super.brag();
        System.out.println("劳资天下第一聪明");
    }
}
