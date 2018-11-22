package main.java.cc.baijunyu.statemode.state;

import main.java.cc.baijunyu.statemode.CandyMachine;
import main.java.cc.baijunyu.statemode.behavior.State;

public class OnReadyState implements State {
    private CandyMachine mCandyMachine;

    /**
     * 状态模式的构造方法（操作完重置状态）
     * @param mCandyMachine
     */
    public OnReadyState(CandyMachine mCandyMachine) {
        this.mCandyMachine = mCandyMachine;
    }

    @Override
    public void insertCoin() {
        // TODO Auto-generated method stub
        System.out
                .println("you have inserted a coin,next,please turn crank!");
        mCandyMachine.setState(mCandyMachine.mHasCoin);
    }

    @Override
    public void returnCoin() {
        // TODO Auto-generated method stub
        System.out.println("you haven't inserted a coin yet!");

    }

    @Override
    public void turnCrank() {
        // TODO Auto-generated method stub
        System.out.println("you turned,but you haven't inserted a coin!");

    }

    @Override
    public void dispense() {
        // TODO Auto-generated method stub

    }

    @Override
    public void printstate() {
        // TODO Auto-generated method stub
        System.out.println("***OnReadyState***");

    }

}
