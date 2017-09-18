package design_pattern.decorator_pattern;

public class Number1Handsome extends Bragger{

    Number1Handsome(NB nb){
        super(nb);
    }

    @Override
    public void brag() {
        super.brag();
        System.out.println("劳资天下第一帅");
    }
}
