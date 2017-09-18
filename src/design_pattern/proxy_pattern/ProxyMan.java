package design_pattern.proxy_pattern;

import org.jetbrains.annotations.NotNull;

public class ProxyMan implements Man {
    @NotNull
    private Man man;


    private String name;

    ProxyMan(String name, @NotNull Man man){
        this.man = man;
        this.name = name;
    }

    @Override
    public void pursuit(Girl girl) {
        System.out.println(girl.toString() + "认识代理" + name);
        man.pursuit(girl);
    }
}
