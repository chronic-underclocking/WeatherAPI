package test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;
import Contracts.IJsonService;
import Services.GsonService;
import ViewModels.Response;

public class GsonServiceTest {

    private IJsonService jservice = new GsonService();
    private String JSON = "{ \"name\": \"Cairo\"}";
    private String JSON2 = "{\"name\": 2}";

    @Test
    public void fromJsonTest()
    {
        Response response = jservice.fromJson(JSON, Response.class);
        Response response2 = jservice.fromJson(JSON2, Response.class);
        assertThat(jservice.fromJson(JSON, Response.class), instanceOf(Response.class));
        assertEquals(response.name, "Cairo");
        assertEquals(response2.name, "2");
    }

    @Test
    public void toJsonTest()
    {
        Response response = jservice.fromJson(JSON, Response.class);
        assertEquals(jservice.toJson(response), "{\n  \"visibility\": 0.0,\n  \"dt\": 0,\n  \"id\": 0,\n  \"name\": \"Cairo\"\n}");
        assertEquals(jservice.toJson(new Response()), "{\n  \"visibility\": 0.0,\n  \"dt\": 0,\n  \"id\": 0\n}");
    }
}
