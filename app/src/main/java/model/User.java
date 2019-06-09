package model;


import java.util.ArrayList;
import java.util.List;

public class User {

    private String email;
    private String password;
    private int points;
    private String imageUrl;
    private String name;
    private String surname;
    private List<Event> favouriteEvents;
    private List<Event> events;

    public User(List<Event> favouriteEvents, List<Event> events) {
        this.favouriteEvents = new ArrayList<>();
        this.events = new ArrayList<>();
    }

    public User(String email, String password, int points, String imageUrl, String name, String surname, List<Event> favouriteEvents, List<Event> events) {
        this.email = email;
        this.password = password;
        this.points = points;
        this.imageUrl = imageUrl;
        this.name = name;
        this.surname = surname;
        this.favouriteEvents = favouriteEvents;
        this.events = events;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public List<Event> getFavouriteEvents() {
        return favouriteEvents;
    }

    public void setFavouriteEvents(List<Event> favouriteEvents) {
        this.favouriteEvents = favouriteEvents;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }
}
