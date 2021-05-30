package pl.sda.weatherman.controller;

import pl.sda.weatherman.model.WeatherRequestModel;

import java.util.logging.Logger;

public class WeathermanController {
    private static final Logger LOGGER = Logger.getLogger(WeathermanController.class.getName());

    // C - create
    public void create(WeatherRequestModel weatherRequestModel) {
        LOGGER.info("create(" + weatherRequestModel + ")");
        // WeatherRequestMapper -> LocationModel locationModel
        // weathermanService.create(locationModel);
    }

    // R - read
    public void read() {
    }

    // U - update
    public void update() {
    }

    // D - delete
    public void delete() {
    }

    // L - list
    public void list() {
    }
}
