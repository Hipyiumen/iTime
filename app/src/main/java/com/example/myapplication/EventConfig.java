package com.example.myapplication;

    public class EventConfig {
        private int ImageId ;
        private String configName;

    public EventConfig(int imageId, String configName) {
        this.ImageId = imageId;
        this.configName = configName;
    }

    public int getImageId() {
        return ImageId;
    }

    public void setImageId(int imageId) { this.ImageId = imageId; }

    public String getConfig() {
        return configName;
    }

    public void setConfig(String config) {
        this.configName = config;
    }


}
