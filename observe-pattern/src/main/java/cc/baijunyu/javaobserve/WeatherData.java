package main.java.cc.baijunyu.javaobserve;

import java.util.Observable;

/**
 * Observable是一个类，
 * 好处：注册、移除、通知不用子类实现
 * 坏处：单继承的缺点
 */
public class WeatherData extends Observable {
    private float mTemperatrue;
    private float mPressure;
    private float mHumidity;

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
        //作用：可以设置通知的条件控制true和false，exm：变化大于多少才通知
        this.setChanged();
        //传数据实体对象
        this.notifyObservers(new Data(getTemperature(), getPressure(), getHumidity()));

    }

    /**
     * 设置数据
     *
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

    /**
     * 数据实体对象
     */
    public class Data {
        public float mTemperatrue;
        public float mPressure;
        public float mHumidity;

        public Data(float mTemperatrue, float mPressure, float mHumidity) {
            this.mTemperatrue = mTemperatrue;
            this.mPressure = mPressure;
            this.mHumidity = mHumidity;
        }
    }

}
