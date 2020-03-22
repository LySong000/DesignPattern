package simplefactory.pizza;

/**
 * @Author: LySong
 * @Date: 2020/3/22 13:50
 */
public class CheesePizza extends Pizza {
    @Override
    public void perpare() {
        System.out.println("给制作奶酪披萨准备原材料");
    }

}
