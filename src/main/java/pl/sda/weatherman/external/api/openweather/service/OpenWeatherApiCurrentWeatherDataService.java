package pl.sda.weatherman.external.api.openweather.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import pl.sda.weatherman.external.api.openweather.model.OpenWeatherApiCurrentWeatherDataResponse;

import java.util.logging.Logger;

public class OpenWeatherApiCurrentWeatherDataService {
    private static final Logger LOGGER = Logger.getLogger(OpenWeatherApiCurrentWeatherDataService.class.getName());

    private static final String BASE_URL =
            "http://api.openweathermap.org/data/2.5/weather";

    public OpenWeatherApiCurrentWeatherDataResponse getCurrentWeather() {
        OkHttpClient client = new OkHttpClient();

        // przygotowanie URL z parametrami
        HttpUrl.Builder urlBuilder = HttpUrl.parse(BASE_URL).newBuilder();
        urlBuilder.addQueryParameter("appid", "d2637e7f85faf82d4f6ddba63038faf2");
        urlBuilder.addQueryParameter("q", "Warszawa");

        String url = urlBuilder.build().toString();

        // przygotowanie GET request
        Request request = new Request.Builder()
                .url(url)
                .build();

        // wykonanie request
        Call call = client.newCall(request);
        try {
            Response response = call.execute();
            String responseString = response.body().string();

            OpenWeatherApiCurrentWeatherDataResponse weatherDataResponse = deserializeResponse(responseString);

            LOGGER.info("response: " + weatherDataResponse);
            return weatherDataResponse;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    OpenWeatherApiCurrentWeatherDataResponse deserializeResponse(String responseString) {
        LOGGER.info("deserializeResponse(" + responseString + ")");

        ObjectMapper objectMapper = new ObjectMapper();
        try {
            OpenWeatherApiCurrentWeatherDataResponse weatherDataResponse =
                    objectMapper.readValue(responseString, OpenWeatherApiCurrentWeatherDataResponse.class);
            LOGGER.info("weatherDataResponse: " + weatherDataResponse);
            return weatherDataResponse;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return null;
    }
}
