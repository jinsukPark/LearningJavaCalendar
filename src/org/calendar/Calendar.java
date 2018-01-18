package org.calendar;

public class Calendar {

	private static final int[] MaxDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private static final int[] LeapMaxDays = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int maxDaysOfMonth(int year, int month) {
		if (isLeapYear(year))
			return LeapMaxDays[month - 1];
		else
			return MaxDays[month - 1];
	}


	public boolean isLeapYear(int year) {
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
			return true;
		else
			return false;
	}

	public void printCalendar(int year,int month) {

		int maxDay = maxDaysOfMonth(year,month);
		System.out.printf("   << %4d , %3d >>\n",year,month);
		System.out.println(" SU MO TU WE TH FI SA ");
		System.out.println("----------------------");

		for (int i = 1; i <=  maxDay ;i++ ) {
			System.out.printf("%3d",i);
			if (i % 7 ==0) {
				System.out.println();
			}

		}
		System.out.println();
	}


}
