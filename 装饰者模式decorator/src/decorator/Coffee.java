package decorator;

/**
 * @Author: LySong
 * @Date: 2020/3/26 14:36
 */
public class Coffee extends Drink {
    @Override
    public float cost() {
        return super.getPrice();
    }
}
