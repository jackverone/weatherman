package pl.sda;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class OpenWeatherApiCurrentWeatherDataServiceTest {

    @Test
    void given_when_then() {
        // given
        OpenWeatherApiCurrentWeatherDataService service = new OpenWeatherApiCurrentWeatherDataService();

        // when
        String currentWeatherString = service.getCurrentWeather();

        // then
        assertNotNull(currentWeatherString, "currentWeatherString is null - no weather data");
    }
}