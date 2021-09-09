package structural.decorator;

class RunnableExtend implements Runnable{

    private Runnable runnable = null;

    public RunnableExtend(Runnable runnable) {
        this.runnable = runnable;
    }

    @Override
    public void run() {
        System.out.println(System.currentTimeMillis());
        runnable.run();
        System.out.println(System.currentTimeMillis());
    }
}
