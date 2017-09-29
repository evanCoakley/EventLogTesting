package com.example;
import java.util.List;
import java.util.ArrayList;

public class EventLog {

     List<Event> eventList;

    public  EventLog() {
        eventList = new ArrayList<>();
    }


    public boolean addEvent(Event event) throws IllegalArgumentException {

       if(event == null) throw new IllegalArgumentException();
        if(event.getAction() == null || event.getName() == null)
            throw new IllegalArgumentException();
        if(event.getAction().equals("Face2Face") ||
                event.getAction().equals("PhoneCall") ||
                event.getAction().equals("TextMessaging") ||
                event.getAction().equals("Unknown")){
            System.out.println("Event Added: " + event);
            eventList.add(event);
            return true;
        }else throw new IllegalArgumentException();
    }
        public int getNumEvents () {
            return eventList.size();
        }


    }







