package javacore;

import org.joda.time.format.DateTimeFormat;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class FindDayOfWeek {
    public static void main(String[] args) {
        int day = 12;
        int month = 10;
        int year = 1995;
        String dayOfWeek = findDay(month,day,year);
        System.out.println("The day on " + month + " " + day + " " + year + " is: " + dayOfWeek);
    }
    public static String findDay(int month, int day, int year){
        //Represent the given day
        LocalDate date = LocalDate.of(year, month, day);
        //Define the date format and locale
        DateTimeFormatter format = DateTimeFormatter.ofPattern("EEE", Locale.ENGLISH);
        //Get the day of week
        String dayOfWeek = date.format(format);
        return dayOfWeek;
    }
}
