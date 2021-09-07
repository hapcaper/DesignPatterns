package creation.simplefactory;

/**
 * Description:
 *
 * @author 李自豪（zihao.li@quantgroup.cn）
 * @since 2021/9/5
 */
class Main {
    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        Product proA = simpleFactory.createIt(SimpleFactory.ProductType.PRODUCT_A);
        Product proB = simpleFactory.createIt(SimpleFactory.ProductType.PRODUCT_B);

        proA.action();
        proB.action();

    }

}
