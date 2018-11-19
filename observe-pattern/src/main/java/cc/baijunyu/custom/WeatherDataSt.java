package main.java.cc.baijunyu.custom;

import main.java.cc.baijunyu.custom.interfacecustom.Observer;
import main.java.cc.baijunyu.custom.interfacecustom.Subject;

import java.util.ArrayList;

public class WeatherDataSt implements Subject {
    private float mTemperatrue;
    private float mPressure;
    private float mHumidity;
    private ArrayList<Observer> mObservers;

    public WeatherDataSt() {
        mObservers = new ArrayList<Observer>();
    }

    public float getTemperature() {
        return mTemperatrue;

    }

    public float getPressure() {
        return mPressure;

    }

    public float getHumidity() {
        return mHumidity;

    }

    /**
     * 数据改变
     */
    public void dataChange() {
        notifyObservers();
    }

    /**
     * 设置数据
     * @param mTemperatrue
     * @param mPressure
     * @param mHumidity
     */
    public void setData(float mTemperatrue, float mPressure, float mHumidity) {
        this.mTemperatrue = mTemperatrue;
        this.mPressure = mPressure;
        this.mHumidity = mHumidity;
        dataChange();
    }

    @Override
    public void registerObserver(Observer o) {
        // TODO Auto-generated method stub
        mObservers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        // TODO Auto-generated method stub
        if (mObservers.contains(o)) {
            mObservers.remove(o);
        }
    }

    @Override
    public void notifyObservers() {
        // TODO Auto-generated method stub
        for (int i = 0, len = mObservers.size(); i < len; i++) {
            mObservers.get(i).update(getTemperature(), getPressure(), getHumidity());
        }
    }
}
