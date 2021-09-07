package creation.builder;

class Director {
    private Builder builder;

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }
    public String construct() {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.getResult();
    }
}
