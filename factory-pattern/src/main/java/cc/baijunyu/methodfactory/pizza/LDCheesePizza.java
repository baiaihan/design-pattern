package main.java.cc.baijunyu.methodfactory.pizza;

import main.java.cc.baijunyu.pizza.Pizza;

public class LDCheesePizza extends Pizza {

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		super.setname("LDCheesePizza");
		
		System.out.println(name+" preparing;");
	}

}
