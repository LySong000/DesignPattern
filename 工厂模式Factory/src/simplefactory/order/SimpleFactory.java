package simplefactory.order;

import simplefactory.pizza.CheesePizza;
import simplefactory.pizza.GreekPizza;
import simplefactory.pizza.PepperPizza;
import simplefactory.pizza.Pizza;

/**
 * 简单工厂类
 * @Author: LySong
 * @Date: 2020/3/22 14:20
 */
public class SimpleFactory {

    public static Pizza createPizza2(String orderType) {
        Pizza pizza = null;
        System.out.println("使用简单工厂");
        if(orderType.equals("greek")){
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        }else if(orderType.equals("cheese")){
            pizza = new CheesePizza();
            pizza.setName("奶酪披萨");
        }else if(orderType.equals("pepper")){
            pizza = new PepperPizza();
            pizza.setName("胡椒披萨");
        }
        return pizza;
    }

    /**
     * 根据orderType返回对象的pizza对象
     * @param orderType
     * @return
     */
    public Pizza createPizza(String orderType){

        Pizza pizza = null;

        System.out.println("使用简单工厂");
        if(orderType.equals("greek")){
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        }else if(orderType.equals("cheese")){
            pizza = new CheesePizza();
            pizza.setName("奶酪披萨");
        }else if(orderType.equals("pepper")){
            pizza = new PepperPizza();
            pizza.setName("胡椒披萨");
        }
        return pizza;
    }

}
