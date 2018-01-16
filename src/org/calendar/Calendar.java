package org.calendar;

import java.util.Scanner;

public class Calendar {
	public static void main(String[] args) {
		System.out.println("일   월   화   수   목   금   토");
		System.out.println("--------------------");
		System.out.println(" 1  2  3  4  5  6  7 ");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");

		//------------------------내 풀이------------------------
//		//입력받은 달의 최대 일수 출력
//		int[] month = {1,2,3,4,5,6,7,8,9,10,11,12};
//		int[] maxDay = {31,28,31,30,31,30,31,31,30,31,30,31};
//
//		System.out.println("달을 입력하세요.");
//		Scanner scanner = new Scanner(System.in);
//		String input1 = scanner.next();
//		int number1 = Integer.parseInt(input1);
//		int i = 0;
//		//입력값이 배열의 어디에 있는지 찾기
//		for(i = 0; i < month.length; i++ ) {
//			if(number1 == month[i]) {
//				break;
//			}
//		}
//		scanner.close();
//		System.out.printf("%d월은 %d일까지 있습니다.",month[i],maxDay[i]);
		//------------------------내 풀이------------------------

		//------------------------해답----------------------------
		Scanner scanner = new Scanner(System.in);
		System.out.println("달을 입력하세요");
		int month = scanner.nextInt();
		int[] maxDays = {31,28,31,30,31,30,31,31,30,31,30,31};

		System.out.printf("%d월은 %d일까지 있습니다.",month,maxDays[month - 1]);
		scanner.close();
		//------------------------해답----------------------------

	}
}
