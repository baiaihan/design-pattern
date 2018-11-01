package main.java.cc.baijunyu.duck;


import main.java.cc.baijunyu.flybehavior.BadFlyBehavior;
import main.java.cc.baijunyu.quackbehavior.GeGeQuackBehavior;

public class RedHeadDuck extends Duck {

	public RedHeadDuck() {
		mFlyBehavior = new BadFlyBehavior();
		mQuackBehavior = new GeGeQuackBehavior();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("**RedHead**");
	}

}
