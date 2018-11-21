package main.java.cc.baijunyu.absfactory.factory;


import main.java.cc.baijunyu.methodfactory.pizza.NYCheesePizza;
import main.java.cc.baijunyu.methodfactory.pizza.NYPepperPizza;
import main.java.cc.baijunyu.pizza.Pizza;

public class NYFactory implements AbsFactory {

	
	@Override
	public Pizza CreatePizza(String ordertype) {
		Pizza pizza = null;

		if (ordertype.equals("cheese")) {
			pizza = new NYCheesePizza();
		} else if (ordertype.equals("pepper")) {
			pizza = new NYPepperPizza();
		}
		return pizza;

	}

}
