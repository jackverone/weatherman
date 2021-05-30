package pl.sda;

import org.junit.jupiter.api.Test;
import pl.sda.weatherman.external.api.openweather.model.OpenWeatherApiCurrentWeatherDataResponse;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class OpenWeatherApiCurrentWeatherDataServiceTest {

    @Test
    void givenService_whenGetCurrentWeather_thenResponseIsNotNull() {
        // given
        OpenWeatherApiCurrentWeatherDataService service = new OpenWeatherApiCurrentWeatherDataService();

        // when
        OpenWeatherApiCurrentWeatherDataResponse weatherDataResponse = service.getCurrentWeather();

        // then
        assertNotNull(weatherDataResponse, "weatherDataResponse is null - no weather data");
    }
}