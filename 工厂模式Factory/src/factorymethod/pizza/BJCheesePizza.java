package factorymethod.pizza;

/**
 * @Author: LySong
 * @Date: 2020/3/22 19:25
 */
public class BJCheesePizza extends Pizza {
    @Override
    public void perpare() {
        setName("北京奶酪披萨");
        System.out.println("北京奶酪披萨");
    }
}
