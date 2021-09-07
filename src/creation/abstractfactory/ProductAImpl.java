package creation.abstractfactory;

/**
 * Description:
 *
 * @author 李自豪（zihao.li@quantgroup.cn）
 * @since 2021/9/6
 */
class ProductAImpl implements ProductA{
    private String info = "";

    @Override
    public String playMusic() {
        return info + "-playMusic";
    }
    @Override
    public void setInfo(String info) {
        this.info = info;
    }
}
