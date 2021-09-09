package structural.decorator;

class Main {
    public static void main(String[] args) {
        Runnable runnable = new RunnableExtend(() -> System.out.println("runnable start"));
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
