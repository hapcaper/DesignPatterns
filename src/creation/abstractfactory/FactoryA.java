package creation.abstractfactory;

/**
 * Description:
 *
 * @author 李自豪（zihao.li@quantgroup.cn）
 * @since 2021/9/6
 */
class FactoryA implements Factory{
    @Override
    public ProductA createProductA() {
        ProductA productA = new ProductAImpl();
        productA.setInfo("FactoryA-creation");
        return productA;

    }

    @Override
    public ProductB createProductB() {
        ProductB productB = new ProductBImpl();
        productB.setInfo("FactoryA-creation");
        return productB;
    }
}
