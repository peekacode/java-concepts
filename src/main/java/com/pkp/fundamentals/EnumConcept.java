package com.pkp.fundamentals;

public class EnumConcept {
    public static void main(String[] args) {
        DaysOfWeek day = DaysOfWeek.TUESDAY;

        System.out.println(day.getName());
        System.out.println(day.isHoliday());
        System.out.println(day.isWeekday());
    }
}

enum DaysOfWeek {
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday"),
    SUNDAY("Sunday");

    private final String name;

    DaysOfWeek(String name) {
        this.name = name;
    }

    public String getName() {
        // Write your code here to return the name of the day
        return this.name;
    }

    public boolean isWeekday() {
        // Write your code here to check if this day is a weekday
        return !isHoliday();
    }

    public boolean isHoliday() {
        // Write your code here to check if this day is a holiday
        return this==SATURDAY || this ==SUNDAY;
    }
}

