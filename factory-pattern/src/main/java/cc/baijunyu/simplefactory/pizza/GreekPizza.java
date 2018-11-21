package main.java.cc.baijunyu.simplefactory.pizza;

import main.java.cc.baijunyu.pizza.Pizza;

public class GreekPizza extends Pizza {

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		super.setname("GreekPizza");
		
		System.out.println(name+" preparing;");
	}

}
