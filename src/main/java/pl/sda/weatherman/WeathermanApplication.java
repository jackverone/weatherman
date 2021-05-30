package pl.sda.weatherman;

import pl.sda.weatherman.cli.WeathermanCliService;

import java.util.Scanner;

public class WeathermanApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WeathermanCliService weathermanCliService =
                new WeathermanCliService(scanner);
        weathermanCliService.mainLoop();
    }
}
