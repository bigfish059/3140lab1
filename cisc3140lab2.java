import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        // create a string to localdate map
        HashMap<String, LocalDate> mymap = new HashMap<String, LocalDate>();

        LocalDate today = LocalDate.now();
        // put the date in the map with the key "today" and so on...
        mymap.put("today", today);
        LocalDate lab1DueDate = LocalDate.of(2022, 9, 28);
        mymap.put("lab1DueDate", lab1DueDate);
        LocalDate lab2DueDate = LocalDate.of(2022, 10, 26);
        mymap.put("lab2DueDate", lab2DueDate);
        LocalDate lab3DueDate = LocalDate.of(2022, 11, 23);
        mymap.put("lab3DueDate", lab3DueDate);
        LocalDate lab4DueDate = LocalDate.of(2022, 12, 7);
        mymap.put("lab4DueDate", lab4DueDate);
        LocalDate quiz1Date = LocalDate.of(2022, 9, 14);
        mymap.put("quiz1Date", quiz1Date);
        LocalDate quiz2Date = LocalDate.of(2022, 9, 28);
        mymap.put("quiz2Date", quiz2Date);
        LocalDate quiz3Date = LocalDate.of(2022, 10, 26);
        mymap.put("quiz3Date", quiz3Date);

        LocalDate quiz4Date = LocalDate.of(2022, 11, 16);
        mymap.put("quiz4Date", quiz4Date);

        LocalDate quiz5Date = LocalDate.of(2022, 12, 7);
        mymap.put("quiz5Date", quiz5Date);
        LocalDate finalDate = LocalDate.of(2022, 12, 19);
        mymap.put("finalDate", finalDate);
        LocalDate startDate = LocalDate.of(1, 1, 1);
        mymap.put("startDate", startDate);
        LocalDate endDate = LocalDate.of(1, 1, 1);
        mymap.put("endDate", endDate);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yyyy");
        String input;
        long dayBetweenDates;

        Scanner sc = new Scanner(System.in);

        // take input from user
        System.out.println("What is the starting date?");
        System.out.println("(Pick from the list below or input a date in the form MM/DD/YYYY)");
        System.out.println(
                "Saved Date: Today, Lab1DueDate, Lab2DueDate, Lab3DueDate, Lab4DueDate, Quiz1Date, Quiz2Date, Quiz3Date, Quiz4Date, Quiz5Date, FinalDate");

        input = sc.nextLine();

        // getting the date from the map by using the key given as input
        startDate = mymap.get(input);

        // getting end date from the user

        System.out.println("What is the ending date?");
        System.out.println("(Pick from the list below or input a date in the form MM/DD/YYYY)");
        System.out.println(
                "Saved Date: Today, Lab1DueDate, Lab2DueDate, Lab3DueDate, Lab4DueDate, Quiz1Date, Quiz2Date, Quiz3Date, Quiz4Date, Quiz5Date, FinalDate");
        input = sc.nextLine();

        // getting the date from the map by using the key given as input

        endDate = mymap.get(input);

        // calculating the difference between the two dates
        dayBetweenDates = ChronoUnit.DAYS.between(startDate, endDate);

        // printing the difference
        if (dayBetweenDates > 0) {
            System.out.println("There are " + dayBetweenDates + " days between " + startDate + " and " + endDate);
        } else {
            dayBetweenDates = -dayBetweenDates;
            System.out.println("There are " + dayBetweenDates + " days between " + startDate + " and " + endDate);
        }
    }
}