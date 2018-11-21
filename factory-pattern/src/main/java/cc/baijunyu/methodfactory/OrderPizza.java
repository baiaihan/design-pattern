package main.java.cc.baijunyu.methodfactory;

import main.java.cc.baijunyu.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public abstract class OrderPizza {

    public OrderPizza() {
        Pizza pizza = null;
        String ordertype;

        do {
            ordertype = gettype();
            //控制反转得到pizza对象，进行加工
            pizza = createPizza(ordertype);
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } while (true);
    }

    /**
     * 由子类具体实现
     *
     * @param ordertype
     * @return
     */
    abstract Pizza createPizza(String ordertype);

    /**
     * 输入pizza类型
     *
     * @return
     */
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
