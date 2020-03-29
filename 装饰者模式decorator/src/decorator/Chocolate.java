package decorator;

/**
 * @Author: LySong
 * @Date: 2020/3/26 15:33
 */
public class Chocolate extends Decorator {
    public Chocolate(Drink drink) {
        super(drink);
        setDes("巧克力");
        setPrice(3.0f);
    }
}
