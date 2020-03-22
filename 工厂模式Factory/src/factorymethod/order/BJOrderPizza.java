package factorymethod.order;

import factorymethod.pizza.BJCheesePizza;
import factorymethod.pizza.BJPepperPizza;
import factorymethod.pizza.Pizza;

/**
 * @Author: LySong
 * @Date: 2020/3/22 19:38
 */
public class BJOrderPizza extends OrderPizza {
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")){
            pizza = new BJCheesePizza();
        }else if(orderType.equals("pepper")){
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
