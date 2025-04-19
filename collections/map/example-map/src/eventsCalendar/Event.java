package eventsCalendar;

import java.time.LocalDate;

public class Event {

    private String name;
    private String appeal;
    private LocalDate date;  

   
    public Event(String name, String appeal, LocalDate date) {
        this.name = name;
        this.appeal = appeal;
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getAppeal() {
        return appeal;
    }

    public String getName() {
        return name;
    }

   @Override
    public String toString() {
        return "Evento: " + name + "\n" +
            "Apelo: " + appeal + "\n" +
            "Data: " + date;
    }


}
