package design_pattern.command_pattern;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

public class CommandLooper implements Runnable {

    private boolean end = false;
    private Executor executor;
    private BlockingQueue<Runnable> queue = new LinkedBlockingDeque<>();

    CommandLooper(Executor executor){
        this.executor = executor;
        new Thread(this).start();
    }


    void add(Runnable runnable){
        queue.offer(runnable);
    }

    public void run(){
        System.out.println("Start to loop command");
        long start = System.currentTimeMillis();
        while (!end){
            try{
                Runnable runnable = queue.poll(3, TimeUnit.SECONDS);
                if (runnable != null){
                    executor.setRunnable(runnable);
                    executor.execute();
                }else{
                    end = true;
                }
            }catch (InterruptedException e){
                e.printStackTrace();
                end = true;
            }
        }
        System.out.println("End to loop command, loop time: " + (System.currentTimeMillis() - start));
    }
}
