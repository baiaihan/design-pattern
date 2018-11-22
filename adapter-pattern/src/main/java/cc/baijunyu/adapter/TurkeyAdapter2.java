package main.java.cc.baijunyu.adapter;


import main.java.cc.baijunyu.duck.Duck;
import main.java.cc.baijunyu.turkey.WildTurkey;

/**
 * 通过继承目标类的方式，来调用被适配者的方法。而不是传入对象
 *
 * -------------继承的方式（不够灵活），优点代码简洁
 */
public class TurkeyAdapter2 extends WildTurkey implements Duck {

    @Override
    public void quack() {
        // TODO Auto-generated method stub
        super.gobble();
    }

    @Override
    public void fly() {
        // TODO Auto-generated method stub
        super.fly();
        super.fly();
        super.fly();
    }
}
