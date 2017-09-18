package design_pattern.proxy_pattern;


/**
 * 代理模式：
 *
 * 有一件事情要做：抽象接口
 * 具体事情这样做：实现类
 * 具体事情不方便直接做，可能需要在做之前或之后处理一些事情： 代理类
 *
 */

public class ProxyMain {

    public static void main(String[] args){
        Girl girl = new Girl();
        girl.name = "Anny";
        Man realMan = new RealMan("卓贾毅");
        Man proxyMan =new ProxyMan("戴励", realMan);
        proxyMan.pursuit(girl);
    }
}
