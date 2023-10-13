package academy.learnprogramming;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class CurrentDate {
        public static void main(String[] args) {
            LocalDate myObj = LocalDate.now(); // Create a date object
            LocalTime myObjTime = LocalTime.now();
            LocalDateTime myObjDateTime = LocalDateTime.now();

            System.out.println(myObj);// Display the current date
            System.out.println(myObjTime);
            System.out.println(myObjDateTime);
        }
    }