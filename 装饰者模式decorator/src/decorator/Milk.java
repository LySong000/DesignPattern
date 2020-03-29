package decorator;

/**
 * @Author: LySong
 * @Date: 2020/3/26 15:34
 */
public class Milk extends Decorator {
    public Milk(Drink drink) {
        super(drink);
        setDes("牛奶");
        setPrice(2.0f);
    }
}
