package creation.builder;

class Main {
    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new ConcreteBuilder());
        System.out.println(director.construct());
    }
}
