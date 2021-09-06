package creation.factorymethod;

/**
 * Description:
 *
 * @author 李自豪（zihao.li@quantgroup.cn）
 * @since 2021/9/6
 */
public class ProductBImpl implements ProductB{

    private String info = "";

    @Override
    public String playVideo() {
        return info + "-playVideo";
    }

    @Override
    public void setInfo(String info) {
        this.info = info;
    }
}
