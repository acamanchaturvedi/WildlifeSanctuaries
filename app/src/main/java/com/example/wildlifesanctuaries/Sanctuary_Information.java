package com.example.wildlifesanctuaries;

public class Sanctuary_Information {
    private String sanctuaryName;
    private String wildlife;
    private String location;
    private String adventure;
    private String year;
    private String area;
    private String lat;
    private String lon;
    public Sanctuary_Information(String sanctuaryName, String wildlife, String location,String adventure,String year, String area)
    {
        this.sanctuaryName=sanctuaryName;
        this.wildlife=wildlife;
        this.location=location;
        this.adventure=adventure;
        this.year=year;
        this.area=area;

    }
    public Sanctuary_Information(String sanctuaryName, String wildlife, String location,String adventure,String year, String area,String lat,String lon)
    {
        this.sanctuaryName=sanctuaryName;
        this.wildlife=wildlife;
        this.location=location;
        this.adventure=adventure;
        this.year=year;
        this.area=area;
        this.lat=lat;
        this.lon=lon;
    }

    public String getSanctuaryName() {
        return sanctuaryName;
    }

    public String getWildlife() {
        return wildlife;
    }

    public String getLocation() {
        return location;
    }

    public String getAdventure() {
        return adventure;
    }

    public String getYear() {
        return year;
    }

    public String getArea() {
        return area;
    }

    public String getLat() {
        return lat;
    }

    public String getLon() {
        return lon;
    }
}