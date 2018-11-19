package main.java.cc.baijunyu.javaobserve;

/**
 * 先进后出，通知顺序是最后一个加入的最先通知
 */
public class InternetWeather {
    public static void main(String[] args) {
        CurrentConditions mCurrentConditions;
        ForcastConditions mForcastConditions;
        WeatherData mWeatherData;

        mCurrentConditions = new CurrentConditions();
        mForcastConditions = new ForcastConditions();
        mWeatherData = new WeatherData();

        mWeatherData.addObserver(mCurrentConditions);
        mWeatherData.addObserver(mForcastConditions);
        mWeatherData.setData(30, 150, 40);

        mWeatherData.deleteObserver(mCurrentConditions);
        mWeatherData.setData(35, 150, 60);

    }
}
