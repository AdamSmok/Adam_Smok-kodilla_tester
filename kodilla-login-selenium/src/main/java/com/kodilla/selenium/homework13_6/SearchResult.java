package com.kodilla.selenium.homework13_6;

public class SearchResult {
    private String name;
    private String imgUrl;
    private String procesor;
    private String resolution;

/*    public SearchResult(String procesor) {
        this.procesor = procesor;
        this.resolution = resolution;
        this.imgUrl = imgUrl;
        this.name = name;
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getProcesor() {
        return procesor;
    }

    public void setProcesor(String procesor) {
        this.procesor = procesor;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }
}