package main.java.cc.baijunyu.simplefactory;


/**
 * 简单工厂测试主函数
 */
public class PizzaStroe {
    public static void main(String[] args) {
        SimplePizzaFactory mSimplePizzaFactory;
        OrderPizza mOrderPizza;
        mOrderPizza = new OrderPizza(new SimplePizzaFactory());
    }


}
