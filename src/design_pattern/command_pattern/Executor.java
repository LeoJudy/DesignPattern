package design_pattern.command_pattern;

public class Executor {
    private Runnable runnable;

    public void setRunnable(Runnable runnable) {
        this.runnable = runnable;
    }

    public void execute(){
        System.out.println("Executor start to execute command at " + System.currentTimeMillis());
        runnable.run();
        System.out.println("Executor execute command end");
    }
}
