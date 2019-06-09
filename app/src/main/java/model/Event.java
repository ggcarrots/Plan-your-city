package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Event {

    private String name;
    private String description;
    private Location location;
    private String address;
    private List<Need> needs;
    private List<User> people;
    private LocalDate start;
    private LocalDate end;
    private EventStatus eventStatus;
    private EventCategory eventCategory;

    public Event() {
         this.needs = new ArrayList<>();
         this.people = new ArrayList<>();
    }

    public Event(String name, String description, Location location, String address, List<Need> needs, List<User> people, LocalDate start, LocalDate end, EventStatus eventStatus, EventCategory eventCategory) {
        this.name = name;
        this.description = description;
        this.location = location;
        this.address = address;
        this.needs = needs;
        this.people = people;
        this.start = start;
        this.end = end;
        this.eventStatus = eventStatus;
        this.eventCategory = eventCategory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Need> getNeeds() {
        return needs;
    }

    public void setNeeds(List<Need> needs) {
        this.needs = needs;
    }

    public List<User> getPeople() {
        return people;
    }

    public void setPeople(List<User> people) {
        this.people = people;
    }

    public LocalDate getStart() {
        return start;
    }

    public void setStart(LocalDate start) {
        this.start = start;
    }

    public LocalDate getEnd() {
        return end;
    }

    public void setEnd(LocalDate end) {
        this.end = end;
    }

    public EventStatus getEventStatus() {
        return eventStatus;
    }

    public void setEventStatus(EventStatus eventStatus) {
        this.eventStatus = eventStatus;
    }

    public EventCategory getEventCategory() {
        return eventCategory;
    }

    public void setEventCategory(EventCategory eventCategory) {
        this.eventCategory = eventCategory;
    }
}
