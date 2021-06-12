package test;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;
import Contracts.IWeatherService;
import Services.WeatherService;

public class WeatherServiceTest {
    
    private IWeatherService weatherService = new WeatherService();

    @Test
    public void getCurrentWeatherTest()
    {
        String cityName = "London";
        int cityID = 120;
        int latitude = 100;
        int longitude = 112;
        assertThat(weatherService.getCurrentWeather(cityName), instanceOf(String.class));
        assertThat(weatherService.getCurrentWeather(cityID), instanceOf(String.class));
        assertThat(weatherService.getCurrentWeather(longitude, latitude), instanceOf(String.class));
        assertThat(weatherService.getCurrentWeather("fff"), instanceOf(String.class));
    }
}
