package main.java.cc.baijunyu.absfactory.factory;


import main.java.cc.baijunyu.pizza.Pizza;

/**
 * 工厂接口
 */
public interface AbsFactory {
	Pizza CreatePizza(String ordertype) ;
}
