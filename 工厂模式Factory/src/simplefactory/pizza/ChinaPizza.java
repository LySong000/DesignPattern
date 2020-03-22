package simplefactory.pizza;

/**
 * @Author: LySong
 * @Date: 2020/3/22 14:33
 */
public class ChinaPizza extends Pizza {

    @Override
    public void perpare() {
        System.out.println("准备中国披萨的原料");
    }
}
