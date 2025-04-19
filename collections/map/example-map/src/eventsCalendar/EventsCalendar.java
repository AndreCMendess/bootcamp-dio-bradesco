package eventsCalendar;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class EventsCalendar {

    private Map<LocalDate, Event> events;

    public EventsCalendar() {
        this.events = new HashMap<>();
    }

    public void addEvent(LocalDate date, String name, String appeal) {
        this.events.put(date, new Event(name, appeal,date));
    }

    public void displayEvents() {
        Map<LocalDate, Event> eventsTreeMap = new TreeMap<>(this.events);
        System.out.println(eventsTreeMap);
    }

    public void getNextEvent() {
        LocalDate dateNow = LocalDate.now();
        LocalDate nextDate = null;
        Event nextEvent = null;
        Map<LocalDate, Event> eventsTreeMap = new TreeMap<>(this.events);
        for(Map.Entry<LocalDate, Event> entry : eventsTreeMap.entrySet()) {
            if(entry.getKey().equals(dateNow) ||  entry.getKey().isAfter(dateNow)) {
                nextDate = entry.getKey();
                nextEvent = entry.getValue();
                System.out.println("O proximo evento" + nextEvent + " acontecera na data de " + nextDate);
                break;
            }
        }
    }


    public static void main(String[] args) {
       EventsCalendar events = new EventsCalendar();

       DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
       events.addEvent(LocalDate.parse("2025-05-01", formatter), "Feriado do Trabalho", "Descanso nacional");
       events.addEvent(LocalDate.parse("2025-06-12", formatter), "Dia dos Namorados", "Comemoração romântica");
       events.addEvent(LocalDate.parse("2025-07-09", formatter), "Aniversário de São Paulo", "Evento estadual");
       events.addEvent(LocalDate.parse("2025-10-12", formatter), "Dia das Crianças", "Diversão e presentes");
       events.addEvent(LocalDate.parse("2025-12-25", formatter), "Natal", "Celebração familiar e religiosa");

       events.displayEvents();
       events.getNextEvent();
    }
}
