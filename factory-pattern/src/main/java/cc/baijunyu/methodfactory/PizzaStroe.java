package main.java.cc.baijunyu.methodfactory;


/**
 * 工厂方法模式：同样的pizza，由不同城市口味
 * 不同城市需要扩展
 * 产品单品需要扩展
 * 比简单工厂多上一层区别条件
 */
public class PizzaStroe {
	public static void main(String[] args) {
		
		OrderPizza mOrderPizza;
		mOrderPizza=new	NYOrderPizza();
		
	}

	

}
