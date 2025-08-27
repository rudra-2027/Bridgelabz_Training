package Assignment_3;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

//Problem 1: Time Zones and ZonedDateTime Write a program that displays the current
//time in different time zones:
//➢ GMT (Greenwich Mean Time)
//➢ IST (Indian Standard Time)
//➢ PST (Pacific Standard Time)
//Hint: Use ZonedDateTime and ZoneId to work with different time zones.
public class Question_1 {
	public static void main(String[] args) {
		
		
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:MM:SS ");
		ZonedDateTime gmtTime = ZonedDateTime.now(ZoneId.of("GMT"));
		ZonedDateTime istTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
		ZonedDateTime pstTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println("Current Time in GMT : " + gmtTime.format(format));
        System.out.println("Current Time in IST : " + istTime.format(format));
        System.out.println("Current Time in PST : " + pstTime.format(format));
		
		
		
	}

}
