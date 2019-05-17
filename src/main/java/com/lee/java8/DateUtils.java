package com.lee.java8;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @author zt
 *
 */
public class DateUtils {
	public static void main(String[] args) {
		System.out.println(LocalDateTime.now());
		System.out.println(LocalDateTime.of(2019, 4, 29, 9, 15, 20));
		System.out.println(new Date());
		System.out.println(formatDateTime(getNow(), "yyyy-MM-dd"));

	}

	public static LocalDateTime getNow() {
		return LocalDateTime.now();
	}

	public static LocalDateTime getSpecialDate(int year, int month, int dayOfMonth, int hours, int minute,
			int seconds) {
		return LocalDateTime.of(year, month, dayOfMonth, hours, minute, seconds);
	}

	/**
	 * @param dateTime
	 * @param pattern  指定格式
	 * @return
	 */
	public static String formatDateTime(LocalDateTime dateTime, String pattern) {
		return dateTime.format(DateTimeFormatter.ofPattern(pattern));
	}

}
