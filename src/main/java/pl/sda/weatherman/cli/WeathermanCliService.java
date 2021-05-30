package pl.sda.weatherman.cli;

import pl.sda.weatherman.controller.WeathermanController;
import pl.sda.weatherman.model.WeatherRequestModel;

import java.util.Scanner;
import java.util.logging.Logger;

public class WeathermanCliService {
    private static final Logger LOGGER = Logger.getLogger(WeathermanCliService.class.getName());

    private Scanner scanner;

    public WeathermanCliService(Scanner scanner) {
        this.scanner = scanner;
    }

    public void mainLoop() {
        LOGGER.info("mainLoop()");
        // while (true)
        // switch (command)

        // V - view
        String city = scanner.nextLine();
        String countryCode = scanner.nextLine();

        // M - model
        WeatherRequestModel weatherRequestModel =
                new WeatherRequestModel(city, countryCode);

        // C - Controller
        WeathermanController weathermanController = new WeathermanController();
        weathermanController.create(weatherRequestModel);

    }
}
