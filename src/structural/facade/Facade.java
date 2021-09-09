package structural.facade;

class Facade {

    private SystemA systemA;
    private SystemB systemB;
    private SystemC systemC;

    public Facade() {
        systemA = new SystemA();
        systemB = new SystemB();
        systemC = new SystemC();
    }

    public void wrapOperation() {
        System.out.println(systemA.operation());
        System.out.println(systemB.operation());
        System.out.println(systemC.operation());
    }
}
