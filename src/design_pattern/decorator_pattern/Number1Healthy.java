package design_pattern.decorator_pattern;

public class Number1Healthy extends Bragger{

    Number1Healthy(NB nb){
        super(nb);
    }

    @Override
    public void brag() {
        super.brag();
        System.out.println("劳资天下第一健康");
    }
}
