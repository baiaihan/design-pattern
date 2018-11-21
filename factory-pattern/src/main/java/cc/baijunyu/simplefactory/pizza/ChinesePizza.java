package main.java.cc.baijunyu.simplefactory.pizza;

import main.java.cc.baijunyu.pizza.Pizza;

public class ChinesePizza extends Pizza {

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		super.setname("ChinesePizza");
		
		System.out.println(name+" preparing;");
	}

}
