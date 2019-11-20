package com.example.myapplication;

public class MainListView {
    public MainListView(String eventTitle, String eventDate, String eventRemark, int eventImageId) {
        this.eventTitle = eventTitle;
        this.eventDate = eventDate;
        this.eventRemark = eventRemark;
        this.eventImageId = eventImageId;
    }

    private String eventTitle;
    private String eventDate;

    public String getEventTitle() {
        return eventTitle;
    }

    public void setEventTitle(String eventTitle) {
        this.eventTitle = eventTitle;
    }

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public String getEventRemark() {
        return eventRemark;
    }

    public void setEventRemark(String eventRemark) {
        this.eventRemark = eventRemark;
    }

    public int getEventImageId() {
        return eventImageId;
    }

    public void setEventImageId(int eventImageId) {
        this.eventImageId = eventImageId;
    }

    private String eventRemark;
    private int eventImageId;

}
