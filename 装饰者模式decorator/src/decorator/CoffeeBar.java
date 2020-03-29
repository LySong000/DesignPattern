package decorator;

import org.omg.CORBA.IRObject;

/**
 * @Author: LySong
 * @Date: 2020/3/26 15:35
 */
public class CoffeeBar {
    public static void main(String[] args) {
        //1.点一份longBlack
        Drink order = new LongBlack();
        System.out.println("费用1：" + order.cost());
        System.out.println("描述1：" + order.getDes());
        //2.点一份牛奶
        order = new Milk(order);
        System.out.println("费用2：" + order.cost());
        System.out.println("描述2：" + order.getDes());
        //3.点一份巧克力
        order = new Chocolate(order);
        System.out.println("费用3：" + order.cost());
        System.out.println("描述3：" + order.getDes());
        //4.点一份巧克力
        order = new Chocolate(order);
        System.out.println("费用3：" + order.cost());
        System.out.println("描述3：" + order.getDes());
    }
}
