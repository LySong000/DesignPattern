package decorator;

/**
 * @Author: LySong
 * @Date: 2020/3/26 15:30
 */
public class Decorator extends Drink {
    private Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public float cost() {
        //super.getPrice()拿到调料自己的价格
        return super.getPrice() + drink.cost();
    }

    @Override
    public String getDes() {
        //drink.getDes()被装饰者信息
        return des + "" + getPrice() + "&&" + drink.getDes();
    }
}
