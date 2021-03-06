package com.example;

public class Event {
    String name;
    String action;

    public Event() {
    }

    public Event(String name, String action) {
        this.name = name;
        this.action = action;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    @Override
    public String toString() {
        return "\nName: " + name + "\n" + "Action: " + action + '\n';}
}
