package creation.simplefactory;

/**
 * Description:
 *
 * @author 李自豪（zihao.li@quantgroup.cn）
 * @since 2021/9/5
 */
class SimpleFactory {

    Product createIt(ProductType productType) {
        switch (productType) {
            case PRODUCT_A:
                return new ProductA();
            case PRODUCT_B:
                return new ProductB();
        }
        return null;
    }

    public enum ProductType{
        PRODUCT_A,PRODUCT_B
    }


}
