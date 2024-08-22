package main.java.map.Sorting;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.time.LocalDate;

public class EventAgenda{
    private Map<LocalDate, Event> eventAgenda;

    public EventAgenda() {
        this.eventAgenda = new HashMap<>();
    }

    public void addEvent(LocalDate date, String eventName, String attractionName){
        eventAgenda.put(date, new Event(eventName, attractionName));
    }

    public void showAgenda(){
        Map<LocalDate, Event> eventsSortedByDate = new TreeMap<>(eventAgenda);
        System.out.println(eventsSortedByDate);
    }

    public void getNextEvent(){
        LocalDate today = LocalDate.now();
        Map<LocalDate, Event> eventSortedByDate = new TreeMap<>(eventAgenda);

        for(var entry: eventSortedByDate.entrySet()){
            if(entry.getKey().isEqual(today) || entry.getKey().isAfter(today)){
                System.out.println("The next event '" + entry.getValue().getName() + "' is happening at " + entry.getKey());
                break;
            }
        }
    }

    public Map<LocalDate, Event> getEventAgenda() {
        return eventAgenda;
    }

    public void setEventAgenda(Map<LocalDate, Event> eventAgenda) {
        this.eventAgenda = eventAgenda;
    }
}