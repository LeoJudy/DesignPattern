package design_pattern.proxy_pattern;

public class RealMan implements Man{

    private String name;
    RealMan(String name){
        this.name = name;
    }

    @Override
    public void pursuit(Girl girl) {
        System.out.println( name + "追求: " + girl);
    }
}
