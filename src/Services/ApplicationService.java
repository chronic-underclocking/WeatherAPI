package Services;

import Contracts.IJsonService;
import Contracts.IWeatherService;
import ViewModels.Response;

public class ApplicationService {
    private IWeatherService weatherService;
    private IJsonService jsonService;

    public ApplicationService(IWeatherService wService, IJsonService jService) {
        weatherService = wService;
        jsonService = jService;
    }

    public String getCurrentWeather(String cityName) {
        try {
            String jString = weatherService.getCurrentWeather(cityName);
            Response response = jsonService.fromJson(jString, Response.class);
            String result = jsonService.toJson(response);
            return result;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }

    public String getCurrentWeather(int id) {
        try {
            String jString = weatherService.getCurrentWeather(id);
            Response response = jsonService.fromJson(jString, Response.class);
            String result = jsonService.toJson(response);
            return result;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }

    public String getCurrentWeather(int longitude, int latitude) {
        try {
            String jString = weatherService.getCurrentWeather(longitude, latitude);
            Response response = jsonService.fromJson(jString, Response.class);
            String result = jsonService.toJson(response);
            return result;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }
}
