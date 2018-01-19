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

	//요일
	public int parseDay(String weekDay) {
		int weekNum = 0;
		switch(weekDay) {
		case "su": weekNum =0;
				break;
		case "mo": weekNum =1;
		break;
		case "tu": weekNum =2;
		break;
		case "we": weekNum =3;
		break;
		case "th": weekNum =4;
		break;
		case "fr": weekNum =5;
		break;
		case "sa": weekNum =6;
		break;
		}
		return weekNum;
	}

	public void printCalendar(int year,int month,String weekDay) {

		int maxDay = maxDaysOfMonth(year,month);
		int parseDay = parseDay(weekDay);
		System.out.printf("   << %4d , %3d >>\n",year,month);
		System.out.println(" SU MO TU WE TH FI SA ");
		System.out.println("----------------------");
		for (int i = 0 ; i < parseDay ; i++) {
		System.out.printf("   ");
		}
		for (int i = 1 ; i <=  maxDay ;i++ ) {
			int today = parseDay + i;
			System.out.printf("%3d",i);
			if (today % 7 ==0) {
				System.out.println();
			}

		}
		System.out.println();
		System.out.println();
	}


}
