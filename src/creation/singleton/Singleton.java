package creation.singleton;

class Singleton {
    private volatile static Singleton singleton;

    private Singleton() {
    }

    static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

    String action() {
        return "singleton";
    }
}
