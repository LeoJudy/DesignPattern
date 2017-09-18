package design_pattern.decorator_pattern;

public abstract class Bragger implements NB{
    private NB nb;

    Bragger(NB nb){
        this.nb = nb;
    }

    @Override
    public void brag() {
        nb.brag();
    }
}
