package org.launchcode.WeatherCheck.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity
public class City extends AbstractEntity {

    @NotNull
    private String cityName;

    @NotNull
    private String state;


    public City () {}

    public City (String cityName, String state) {
        this.cityName = cityName;
        this.state = state;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
