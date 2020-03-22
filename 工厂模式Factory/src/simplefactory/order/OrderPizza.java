package simplefactory.order;

import com.sun.org.apache.bcel.internal.generic.SIPUSH;
import simplefactory.pizza.CheesePizza;
import simplefactory.pizza.GreekPizza;
import simplefactory.pizza.PepperPizza;
import simplefactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author: LySong
 * @Date: 2020/3/22 13:52
 */
public class OrderPizza {
//    public OrderPizza(){
//        Pizza pizza = null;
//        //订购披萨的类型
//        String orderType;
//        do{
//            orderType = getType();
//            if(orderType.equals("greek")){
//                pizza = new GreekPizza();
//                pizza.setName("希腊披萨");
//            }else if(orderType.equals("cheese")){
//                pizza = new CheesePizza();
//                pizza.setName("奶酪披萨");
//            }else if(orderType.equals("pepper")){
//                pizza = new PepperPizza();
//                pizza.setName("胡椒披萨");
//            } else {
//                break;
//            }
//            //输出披萨制作过程
//            pizza.perpare();
//            pizza.bake();
//            pizza.cut();
//            pizza.box();
//        }while (true);
//    }

    SimpleFactory simpleFactory;
    Pizza pizza = null;

    public OrderPizza(SimpleFactory simpleFactory){
        setSimpleFactory(simpleFactory);
    }

    public void setSimpleFactory(SimpleFactory simpleFactory){
        String orderType = "";
        //设置简单工厂对象
        this.simpleFactory = simpleFactory;

        do{
            orderType = getType();
            pizza = this.simpleFactory.createPizza(orderType);
            //输出信息
            if(pizza != null){
                pizza.perpare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else {
                System.out.println("订购失败");
                break;
            }
        }while (true);
    }


    /**
     * 获取客户订购披萨的种类
     * @return
     */
    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza 种类:");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
