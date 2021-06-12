package Services;

import Contracts.IWeatherService;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class WeatherService implements IWeatherService {

    private final HttpClient client = HttpClient.newHttpClient();
    private final String key = "";

    @Override
    public String getCurrentWeather(String cityName) {
        HttpRequest request = HttpRequest.newBuilder()
          .uri(URI.create("http://api.openweathermap.org/data/2.5/weather?q=" + cityName + "&APPID=" + key))
          .build();
        try {
            HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
            return response.body();
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String getCurrentWeather(int cityId) {
        HttpRequest request = HttpRequest.newBuilder()
          .uri(URI.create("http://api.openweathermap.org/data/2.5/weather?id=" + cityId + "&APPID=" + key))
          .build();
        try {
            HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
            return response.body();
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String getCurrentWeather(int latitude, int longitude) {
        HttpRequest request = HttpRequest.newBuilder()
          .uri(URI.create("http://api.openweathermap.org/data/2.5/weather?lat=" + Integer.toString(latitude) + "&lon=" + Integer.toString(longitude) + "&APPID=" + key))
          .build();
        try {
            HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
            return response.body();
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
