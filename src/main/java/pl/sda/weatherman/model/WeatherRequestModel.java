package pl.sda.weatherman.model;

public class WeatherRequestModel {
    private String city;
    private String countryCode;

    public WeatherRequestModel(String city, String countryCode) {
        this.city = city;
        this.countryCode = countryCode;
    }
}
