package main.java.cc.baijunyu;

import main.java.cc.baijunyu.duck.Duck;
import main.java.cc.baijunyu.duck.GreenHeadDuck;
import main.java.cc.baijunyu.duck.RedHeadDuck;
import main.java.cc.baijunyu.flybehavior.NoFlyBehavior;
import main.java.cc.baijunyu.quackbehavior.NoQuackBehavior;

public class TestDuck {
    public static void main(String[] args) {

        Duck mGreenHeadDuck = new GreenHeadDuck();
        Duck mRedHeadDuck = new RedHeadDuck();

        mGreenHeadDuck.display();
        mGreenHeadDuck.Fly();
        mGreenHeadDuck.Quack();
        mGreenHeadDuck.swim();

        mRedHeadDuck.display();
        mRedHeadDuck.Fly();
        mRedHeadDuck.Quack();
        mRedHeadDuck.swim();
        mRedHeadDuck.display();
        mRedHeadDuck.SetFlyBehavoir(new NoFlyBehavior());
        mRedHeadDuck.Fly();
        mRedHeadDuck.SetQuackBehavoir(new NoQuackBehavior());
        mRedHeadDuck.Quack();
    }
}
