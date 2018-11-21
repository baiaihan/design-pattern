package main.java.cc.baijunyu.simplefactory.pizza;

import main.java.cc.baijunyu.pizza.Pizza;

public class CheesePizza extends Pizza {

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		super.setname("CheesePizza");
		
		System.out.println(name+" preparing;");
	}

}
