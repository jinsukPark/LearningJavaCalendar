package org.calendar;

import java.util.Scanner;

public class Prompt {


	public static void main(String[] args) {

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


		Scanner scanner = new Scanner(System.in);
		Calendar calendar = new Calendar();

		while (true) {
			System.out.println("년도를 입력하세요. (-1 : 종료)");
			System.out.print("YEAR > ");
			int year = scanner.nextInt();
			if (year == -1) {
				break;
			}
			System.out.println("달을 입력하세요");
			System.out.print("MONTH > ");
			int month = scanner.nextInt();
			//시작하는 요일을 계산

			int weekDay = calendar.startWeekDay(year, month);

				//달력을 표시
				calendar.printCalendar(year,month,weekDay);
		}
		System.out.println("bye!");
		scanner.close();

	}

}
