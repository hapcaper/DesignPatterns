package creation.factorymethod;

/**
 * Description:
 *
 * @author 李自豪（zihao.li@quantgroup.cn）
 * @since 2021/9/6
 */
public class FactoryB implements Factory{
    @Override
    public ProductA createProductA() {
        ProductA productA = new ProductAImpl();
        productA.setInfo("FactoryB-creation");
        return productA;

    }

    @Override
    public ProductB createProductB() {
        ProductB productB = new ProductBImpl();
        productB.setInfo("FactoryB-creation");
        return productB;
    }
}
