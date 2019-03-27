package com.example.eventmanagementapp;

public class Event {
    private int image;
    private String eventName;
    private String eventCategory;
    private String eventDetails;
    private String eventLocation;

    public Event(int image, String eventName, String eventCategory, String eventDetails, String eventLocation) {
        this.image = image;
        this.eventName = eventName;
        this.eventCategory = eventCategory;
        this.eventDetails = eventDetails;
        this.eventLocation = eventLocation;
    }

    public int getImage() {
        return image;
    }

    public String getEventName() {
        return eventName;
    }

    public String getEventCategory() {
        return eventCategory;
    }

    public String getEventDetails() {
        return eventDetails;
    }

    public String getEventLocation() {
        return eventLocation;
    }
}
