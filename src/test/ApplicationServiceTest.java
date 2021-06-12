package test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
import org.junit.Test;
import org.junit.Before;
import Contracts.IJsonService;
import Contracts.IWeatherService;
import Services.ApplicationService;
import ViewModels.Response;

public class ApplicationServiceTest {

    private ApplicationService appService;
    private IWeatherService mockWeather;
    private IJsonService mockJservice;

    @Before
    public void init()
    {
        mockWeather = mock(IWeatherService.class);
        mockJservice = mock(IJsonService.class);
        appService = new ApplicationService(mockWeather, mockJservice);
    }

    @Test
    public void getCurrentWeatherTest()
    {
        String cityName = "London";
        int cityID = 120;
        int latitude = 100;
        int longitude = 112;
        Response rsp = new Response();
        when(mockWeather.getCurrentWeather(cityName)).thenReturn("JSON file");
        when(mockWeather.getCurrentWeather(cityID)).thenReturn("JSON file");
        when(mockWeather.getCurrentWeather(longitude, latitude)).thenReturn("JSON file");
        when(mockJservice.fromJson("JSON file", Response.class)).thenReturn(rsp);
        when(mockJservice.toJson(rsp)).thenReturn("parsed JSON");
        assertEquals(appService.getCurrentWeather(cityName), "parsed JSON");
        assertEquals(appService.getCurrentWeather(cityID), "parsed JSON");
        assertEquals(appService.getCurrentWeather(longitude, latitude), "parsed JSON");
    }
    
}
