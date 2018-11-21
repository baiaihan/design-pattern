package main.java.cc.baijunyu.methodfactory.pizza;

import main.java.cc.baijunyu.pizza.Pizza;

public class LDPepperPizza extends Pizza {

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		super.setname("LDPepperPizza");
		
		System.out.println(name+" preparing;");
	}

}
