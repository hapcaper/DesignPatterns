package creation.builder;

class ConcreteBuilder implements Builder{
    private String product = "";
    @Override
    public void buildPartA() {
        product += "partA";
    }

    @Override
    public void buildPartB() {
        product += "-partB";
    }

    @Override
    public void buildPartC() {
        product += "-partC";
    }

    @Override
    public String getResult() {
        return product;
    }
}
