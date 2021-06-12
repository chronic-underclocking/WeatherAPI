package Services;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import Contracts.IJsonService;

public class GsonService implements IJsonService {
    private static GsonBuilder builder = new GsonBuilder().setPrettyPrinting(); 
    private static Gson gson = builder.create();

    @Override
    public <T> T fromJson(String jsonString, Class<T> classOfT) {
        return gson.fromJson(jsonString, classOfT);
    }

    @Override
    public String toJson(Object object) {
        return gson.toJson(object);
    }

}
