package main.java.cc.baijunyu.methodfactory.pizza;

import main.java.cc.baijunyu.pizza.Pizza;

public class NYPepperPizza extends Pizza {

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		super.setname("NYPepperPizza");
		
		System.out.println(name+" preparing;");
	}

}
