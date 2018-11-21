package main.java.cc.baijunyu.absfactory.factory;


import main.java.cc.baijunyu.methodfactory.pizza.LDCheesePizza;
import main.java.cc.baijunyu.methodfactory.pizza.LDPepperPizza;
import main.java.cc.baijunyu.pizza.Pizza;

/**
 * 与工厂方式模式目的一样，将工厂类变成可扩展
 */
public class LDFactory implements AbsFactory {

	@Override
	public Pizza CreatePizza(String ordertype) {
		Pizza pizza = null;

		if (ordertype.equals("cheese")) {
			pizza = new LDCheesePizza();
		} else if (ordertype.equals("pepper")) {
			pizza = new LDPepperPizza();
		}
		return pizza;

	}

}
