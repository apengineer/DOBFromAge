package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DobFromAge {

	public static void main(String[] args) {
		// 10 years and 10 days
		int ageYears = 10;
		int ageDays = 10;	
		getDob(ageYears, ageDays);

	}

	public static void getDob(int ageYears, int ageDays){	
		Calendar calendar = Calendar.getInstance();
		int yearOfBirth = calendar.get(Calendar.YEAR)- ageYears ;	// current year - age
		int currentDay = calendar.get(Calendar.DAY_OF_YEAR); 			
		int offset = currentDay - ageDays ; // how many days are over after birthdate.
		calendar.set(Calendar.DAY_OF_YEAR, offset);
		calendar.set(Calendar.YEAR, yearOfBirth);
        System.out.println("DOB: " + calendar.get(Calendar.DAY_OF_MONTH)+ "-"+calendar.getDisplayName(Calendar.MONTH, Calendar.LONG_FORMAT, Locale.ENGLISH)
        + "-"  + yearOfBirth);
	}
}
