package main.java.cc.baijunyu;

import main.java.cc.baijunyu.pizza.Pizza;
import main.java.cc.baijunyu.simplefactory.pizza.CheesePizza;
import main.java.cc.baijunyu.simplefactory.pizza.ChinesePizza;
import main.java.cc.baijunyu.simplefactory.pizza.GreekPizza;
import main.java.cc.baijunyu.simplefactory.pizza.PepperPizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 没有设计的实现方式
 */
public class OrderPizza {

    public OrderPizza() {
        Pizza pizza = null;
        String ordertype;

        do {
            ordertype = gettype();
            //-------------------将这里获取对象抽离，统一管理------------------------
            if (ordertype.equals("cheese")) {
                pizza = new CheesePizza();
            } else if (ordertype.equals("greek")) {
                pizza = new GreekPizza();
            } else if (ordertype.equals("pepper")) {
                pizza = new PepperPizza();
            } else if (ordertype.equals("chinese")) {
                pizza = new ChinesePizza();
            } else {
                break;
            }
            //------------------------------------------------------------------------
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } while (true);
    }

    private String gettype() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(
                    System.in));
            System.out.println("input pizza type:");
            String str = strin.readLine();

            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

}
