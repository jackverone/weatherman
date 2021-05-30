package pl.sda;

import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class OpenWeatherApiCurrentWeatherDataService {
    private static final String BASE_URL =
            "http://api.openweathermap.org/data/2.5/weather";

    public String getCurrentWeather() {
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
            return response.body().string();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
