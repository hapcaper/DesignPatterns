package creation.simplefactory;

/**
 * Description:
 *
 * @author 李自豪（zihao.li@quantgroup.cn）
 * @since 2021/9/5
 */
class ProductA implements Product{

    @Override
    public void action() {
        System.out.println("ProductA-action");
    }
}
