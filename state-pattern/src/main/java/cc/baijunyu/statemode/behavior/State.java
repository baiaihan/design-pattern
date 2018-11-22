package main.java.cc.baijunyu.statemode.behavior;

/**
 * 行为接口，在各种状态下的行为抽象
 */
public interface State {

    public void insertCoin();

    public void returnCoin();

    public void turnCrank();

    public void dispense();

    public void printstate();
}
