package absfactory.order;

import absfactory.pizza.BJCheesePizza;
import absfactory.pizza.BJPepperPizza;
import absfactory.pizza.Pizza;

/**
 * @Author: LySong
 * @Date: 2020/3/22 20:07
 */
public class BJfactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")){
            pizza = new BJCheesePizza();
        }else if(orderType.equals("pepper")){
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
