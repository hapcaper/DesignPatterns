package creation.factorymethod;

/**
 * Description:
 *
 * @author 李自豪（zihao.li@quantgroup.cn）
 * @since 2021/9/6
 */
public class Main {
    public static void main(String[] args) {
        Factory factoryA = new FactoryA();
        Factory factoryB = new FactoryB();
        ProductA productA = factoryA.createProductA();
        ProductB productB = factoryA.createProductB();
        ProductA productA1 = factoryB.createProductA();
        ProductB productB1 = factoryB.createProductB();

        System.out.println(productA.playMusic());
        System.out.println(productB.playVideo());
        System.out.println(productA1.playMusic());
        System.out.println(productB1.playVideo());


    }
}
