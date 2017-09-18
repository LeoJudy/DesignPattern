package design_pattern.command_pattern;

import java.util.UUID;


/**
 * 命令模式： 将一个请求封装成一个对象，从而使你可以用不同的请求对客户进行参数化， 对请求排队
 * 或记录请求日志以及支持可撤销的操作。
 *
 * 考虑 android 的 handler 机制，就是理解成这个模式
 */
public class CommandMain {

    public static void main(String[] args){
        Executor executor = new Executor();
        CommandLooper looper = new CommandLooper(executor);
        for(int i = 0; i < 3; i++){
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){e.printStackTrace();}
            Runnable r = () -> System.out.println(UUID.randomUUID());
            looper.add(r);
        }
    }
}
