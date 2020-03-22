package absfactory.order;

import absfactory.pizza.Pizza;

/**
 * @Author: LySong
 * @Date: 2020/3/22 20:06
 */
public interface AbsFactory {
    public Pizza createPizza(String orderType);
}
