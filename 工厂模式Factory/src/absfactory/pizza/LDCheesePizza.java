package absfactory.pizza;

/**
 * @Author: LySong
 * @Date: 2020/3/22 19:28
 */
public class LDCheesePizza extends Pizza {
    @Override
    public void perpare() {
        setName("伦敦奶酪披萨");
        System.out.println("伦敦奶酪披萨");
    }
}
