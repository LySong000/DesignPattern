package simplefactory.order;

import com.sun.org.apache.xpath.internal.operations.Or;
import simplefactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OptionalDataException;

/**
 * @Author: LySong
 * @Date: 2020/3/22 14:36
 */
public class OrderPizza2 {

    Pizza pizza = null;
    String orderType;

    public OrderPizza2(){
        do{
            orderType = getType();
            pizza = SimpleFactory.createPizza2(orderType);
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
