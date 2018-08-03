package com.vbee.vbeepos.util;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateTimeUtil {
	
	public static String dateFormat(Date date, Locale locale) {
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		return dateFormat.format(date);
	}
	
}
