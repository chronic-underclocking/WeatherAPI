package ViewModels;

import com.google.gson.annotations.SerializedName;

public class Response {

    @SerializedName("coord")
    private Coord coord;

    @SerializedName("weather")
    private Weather[] weather;

    @SerializedName("base")
    public String base;

    @SerializedName("main")
    public Main main;

    @SerializedName("visibility")
    public double visibility;

    @SerializedName("wind")
    public Wind wind;

    @SerializedName("clouds")
    public Clouds clouds;

    @SerializedName("dt")
    public long dt;

    @SerializedName("sys")
    public Sys sys;

    @SerializedName("timezone")
    public String timezone;

    @SerializedName("id")
    public int id;

    @SerializedName("name")
    public String name;

    private static class Coord
    {
        @SerializedName("lon")
        public String longitude;

        @SerializedName("lat")
        public String latitude;
    }

    private static class Weather
    {
        @SerializedName("id")
        public int id;

        @SerializedName("main")
        public String main;

        @SerializedName("description")
        public String description;

        @SerializedName("icon")
        public String icon;
    }

    private static class Main
    {
        @SerializedName("temp")
        public double temp;

        @SerializedName("feels_like")
        public double feels_like;

        @SerializedName("temp_min")
        public double temp_min;

        @SerializedName("temp_max")
        public double temp_max;

        @SerializedName("pressure")
        public double pressure;

        @SerializedName("humidity")
        public double humidity;
    }

    private static class Wind
    {
        @SerializedName("speed")
        public double speed;

        @SerializedName("deg")
        public double deg;

        @SerializedName("gust")
        public double gust;
    }

    private static class Clouds
    {
        @SerializedName("all")
        public String all;
    }

    private static class Sys
    {
        @SerializedName("type")
        public int type;

        @SerializedName("id")
        public double id;

        @SerializedName("country")
        public String country;

        @SerializedName("sunrise")
        public double sunrise;

        @SerializedName("sunset")
        public double sunset;
    }
}
