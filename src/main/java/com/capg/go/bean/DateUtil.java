package com.capg.go.bean;


	import java.text.DateFormat;
	import java.text.SimpleDateFormat;
	import java.util.Date;

import com.capg.go.exception.IncorrectDateException;
	public class DateUtil {
	    public static Date toDate(String pattern, String dateText) {
	        DateFormat format = new SimpleDateFormat(pattern);
	        try {
	            Date date = format.parse(dateText);
	            return date;
	        } catch (Exception e) {
	            throw new IncorrectDateException("incorrect date=" + dateText + " pattern=" + pattern);
	        }
	    }
	    public static String toString(Date date, String pattern) {
	        DateFormat format = new SimpleDateFormat(pattern);
	        String dateText = format.format(date);
	        return dateText;
	    }
	}


