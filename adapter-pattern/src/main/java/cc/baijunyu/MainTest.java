package main.java.cc.baijunyu;


import main.java.cc.baijunyu.adapter.TurkeyAdapter2;
import main.java.cc.baijunyu.duck.Duck;
import main.java.cc.baijunyu.duck.GreenHeadDuck;
import main.java.cc.baijunyu.turkey.WildTurkey;

public class MainTest {
	public static void main(String[] args) {
		GreenHeadDuck duck=new GreenHeadDuck();
		
		WildTurkey turkey=new WildTurkey();
		
		Duck duck2turkeyAdapter=new TurkeyAdapter2();
		turkey.gobble();
		turkey.fly();
		duck.quack();
		duck.fly();
		duck2turkeyAdapter.quack();
		duck2turkeyAdapter.fly();
		
	
	}
}
