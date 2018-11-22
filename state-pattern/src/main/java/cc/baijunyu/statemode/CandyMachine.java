package main.java.cc.baijunyu.statemode;

import main.java.cc.baijunyu.statemode.behavior.State;
import main.java.cc.baijunyu.statemode.state.*;

/**
 * 状态模式，糖果机设计
 */
public class CandyMachine {

    public State mSoldOutState;
    public State mOnReadyState;
    //-----还能解耦
    public State mHasCoin;
    public State mSoldState;
    public State mWinnerState;
    /**
     * 当前状态
     */
    private State state;
    private int count = 0;

    public CandyMachine(int count) {
        this.count = count;
        mSoldOutState = new SoldOutState(this);
        mOnReadyState = new OnReadyState(this);
        mHasCoin = new HasCoin(this);
        mSoldState = new SoldState(this);
        mWinnerState = new WinnerState(this);
        if (count > 0) {
            state = mOnReadyState;
        } else {
            state = mSoldOutState;
        }
    }

    /**
     * 设置状态
     * @param state
     */
    public void setState(State state) {
        this.state = state;
    }

    /**
     * 用户操作
     */
    public void insertCoin() {
        state.insertCoin();
    }

    public void returnCoin() {
        state.returnCoin();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    public void releaseCandy() {

        // TODO Auto-generated method stub
        if (count > 0) {
            count = count - 1;
            System.out.println("a candy rolling out!");
        }

    }

    public int getCount() {
        return count;
    }

    public void printstate() {
        state.printstate();
    }
}
