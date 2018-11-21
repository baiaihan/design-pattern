package main.java.cc.baijunyu.methodfactory;


import main.java.cc.baijunyu.methodfactory.pizza.LDCheesePizza;
import main.java.cc.baijunyu.methodfactory.pizza.LDPepperPizza;
import main.java.cc.baijunyu.pizza.Pizza;

/**
 * 核心：通过控制反转IOC将具体创建对象的工厂交由子类实现，通过一个抽象方法实现工厂类可扩展，所以为工厂方法模式
 */
public class LDOrderPizza extends OrderPizza {

    @Override
    Pizza createPizza(String ordertype) {
        Pizza pizza = null;
        //目的输入的不带城市区别
        if (ordertype.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (ordertype.equals("pepper")) {
            pizza = new LDPepperPizza();
        }
        return pizza;

    }

}
