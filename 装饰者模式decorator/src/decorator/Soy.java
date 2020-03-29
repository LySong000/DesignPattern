package decorator;

/**
 * @Author: LySong
 * @Date: 2020/3/26 15:35
 */
public class Soy extends Decorator {
    public Soy(Drink drink) {
        super(drink);
        setDes("豆浆");
        setPrice(1.0f);
    }
}
