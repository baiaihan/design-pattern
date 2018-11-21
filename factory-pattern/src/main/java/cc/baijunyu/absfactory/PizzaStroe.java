package main.java.cc.baijunyu.absfactory;


import main.java.cc.baijunyu.absfactory.factory.LDFactory;

/**
 * 传不同的工厂，得到不同的产品对象
 */
public class PizzaStroe {
	public static void main(String[] args) {
		
		OrderPizza mOrderPizza;

		mOrderPizza=new	OrderPizza(new LDFactory());
		
	}

	

}
