package simplefactory.order;

/**
 * 客户端，完成披萨订购任务
 * @Author: LySong
 * @Date: 2020/3/22 14:01
 */
public class PizzaStore {

    public static void main(String[] args) {
        //new OrderPizza();
        //使用简单工厂模式
        new OrderPizza2();
        System.out.println("退出程序");
    }

}
