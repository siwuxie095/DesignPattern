package com.siwuxie095.designpattern.summary.pattern2nd.observer.example1st;

/**
 * 目前状况布告
 *
 * @author Jiajing Li
 * @date 2019-08-12 23:21:59
 */
class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;

    private float humidity;

    private Subject weatherData;

    CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity"
                + "\nAvg/Max/Min temperature = " + temperature);
    }
}

