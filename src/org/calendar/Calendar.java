package org.calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

public class Calendar {

	private static final int[] MaxDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private static final int[] LeapMaxDays = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	private HashMap<Date, String> planMap;

	public Calendar() {
		planMap = new HashMap<Date, String>();
	}

	/**
	 *
	 * @param strDate ex:"2017-06-25"
	 * @param plan
	 */
	public void registerPlan(String strDate, String plan) {
		try {
			Date date = new SimpleDateFormat("yyyy-mm-dd").parse(strDate);
			System.out.println(date);
			planMap.put(date, plan);
		} catch (ParseException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}
	public String searchPlan(String strDate) {
			Date date = null;
			try {
				date = new SimpleDateFormat("yyyy-mm-dd").parse(strDate);
			} catch (ParseException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
			String plan = planMap.get(date);
			return plan;
		}




	//달의 마지막날
	public int maxDaysOfMonth(int year, int month) {
		if (isLeapYear(year))
			return LeapMaxDays[month - 1];
		else
			return MaxDays[month - 1];
	}

	//윤년 계산 로직
	public boolean isLeapYear(int year) {
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
			return true;
		else
			return false;
	}

	//1년 1월 1일은 월요일
	//참고 1970년1월1일목요일 -> 컴퓨터 달력 시작일
	public int startWeekDay(int year, int month) {
		int StartWeekDay = 0;
		int yearCounter = 0;
		int dayCounter = 0;

		for (yearCounter = 1; yearCounter < year; yearCounter++) {
			if (isLeapYear(yearCounter)) {
				dayCounter += 366;
			} else {
				dayCounter += 365;
			}
		}
		if (isLeapYear(year)) {
			for (int i = 1; i < month; i++) {
				dayCounter += LeapMaxDays[i - 1];
			}
		} else {
			for (int i = 1; i < month; i++) {
				dayCounter += MaxDays[i - 1];
			}
		}

		StartWeekDay = (dayCounter + 1) % 7;

		System.out.println("yearCounter " + yearCounter);
		System.out.println("dayCounter " + dayCounter);
		System.out.println("StartWeekDay " + StartWeekDay);
		System.out.println("isLeapYear(yearCounter) " + isLeapYear(yearCounter));

		return StartWeekDay;
	}

	//프린터 출력 메소드
	public void printCalendar(int year, int month, int weekDay) {

		int maxDay = maxDaysOfMonth(year, month);
		int StartWeekDay = weekDay;

		System.out.printf("   << %4d , %3d >>\n", year, month);
		System.out.println(" SU MO TU WE TH FI SA ");
		System.out.println("----------------------");
		for (int i = 0; i < StartWeekDay; i++) {
			System.out.printf("   ");
		}
		for (int i = 1; i <= maxDay; i++) {
			int today = StartWeekDay + i;
			System.out.printf("%3d", i);
			if (today % 7 == 0) {
				System.out.println();
			}

		}
		System.out.println();
		System.out.println();
	}

}
