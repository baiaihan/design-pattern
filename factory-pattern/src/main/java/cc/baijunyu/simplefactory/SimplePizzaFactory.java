package main.java.cc.baijunyu.simplefactory;


import main.java.cc.baijunyu.pizza.Pizza;
import main.java.cc.baijunyu.simplefactory.pizza.CheesePizza;
import main.java.cc.baijunyu.simplefactory.pizza.GreekPizza;
import main.java.cc.baijunyu.simplefactory.pizza.PepperPizza;

/**
 * 简单工厂，项目中有多处需要实例化对象，为了将变化的部分抽离出来统一管理
 * （族、工厂类是变化部分）
 */
public class SimplePizzaFactory {

	public Pizza CreatePizza(String ordertype) {
		Pizza pizza = null;

		if (ordertype.equals("cheese")) {
			pizza = new CheesePizza();
		} else if (ordertype.equals("greek")) {
			pizza = new GreekPizza();
		} else if (ordertype.equals("pepper")) {
			pizza = new PepperPizza();
		}
		return pizza;

	}

}
