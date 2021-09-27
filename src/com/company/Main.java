package com.company;

public class Main {

    public static void main(String[] args) {
        Publisher sportsApp = new Publisher();

        sportsApp.addEvent("Barcelona 2:8 Bayern");
        sportsApp.removeEvent("Barcelona 2:8 Bayern");

        sportsApp.addEvent("Tottenham 3:2 Ajax");

        User someSub = new User();

        sportsApp.subscribe(someSub);

        sportsApp.addEvent("TTH 0:2 LVP");

        sportsApp.unsubscribe(someSub);

        sportsApp.addEvent("MCU 0:1 CHE");
    }
}
