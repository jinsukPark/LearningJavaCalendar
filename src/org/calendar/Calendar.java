package org.calendar;

public class Calendar {

	private static final int[] MaxDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private static final int[] LeapMaxDays = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

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


	public void printCalendar(int year,int month,int weekDay) {

		int maxDay = maxDaysOfMonth(year,month);
		int StartWeekDay = weekDay;

		System.out.printf("   << %4d , %3d >>\n",year,month);
		System.out.println(" SU MO TU WE TH FI SA ");
		System.out.println("----------------------");
		for (int i = 0 ; i < StartWeekDay ; i++) {
		System.out.printf("   ");
		}
		for (int i = 1 ; i <=  maxDay ;i++ ) {
			int today = StartWeekDay + i;
			System.out.printf("%3d",i);
			if (today % 7 ==0) {
				System.out.println();
			}

		}
		System.out.println();
		System.out.println();
	}


}
