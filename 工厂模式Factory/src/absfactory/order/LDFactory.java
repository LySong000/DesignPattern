package absfactory.order;

import absfactory.pizza.BJCheesePizza;
import absfactory.pizza.BJPepperPizza;
import absfactory.pizza.LDCheesePizza;
import absfactory.pizza.Pizza;

/**
 * @Author: LySong
 * @Date: 2020/3/22 20:08
 */
public class LDFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")){
            pizza = new LDCheesePizza();
        }else if(orderType.equals("pepper")){
            pizza = new LDCheesePizza();
        }
        return pizza;
    }
}
