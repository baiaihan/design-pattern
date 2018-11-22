package main.java.cc.baijunyu.adapter;


import main.java.cc.baijunyu.duck.Duck;
import main.java.cc.baijunyu.turkey.Turkey;

/**
 * 继承自鸭子，传入个火鸡“对象适配器”，表面调用鸭子的方法，实际执行的火鸡的方法
 * 适配器构造方法，传入实际对象的方式称为“对象适配器”
 *
 * ----组合的方式实现（灵活）
 */
public class TurkeyAdapter implements Duck {
    private Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        // TODO Auto-generated method stub
        turkey.gobble();
    }

    @Override
    public void fly() {
        // TODO Auto-generated method stub
        for (int i = 0; i < 6; i++) {
            turkey.fly();
        }
    }

}
