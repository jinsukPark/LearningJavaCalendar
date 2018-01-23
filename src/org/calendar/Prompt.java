package org.calendar;

import java.util.Scanner;

public class Prompt {

	//초기 화면 표시 메소드
	public static void printMenu() {
		System.out.println("+----------------------+");
		System.out.println("| 1. 일정 등록");
		System.out.println("| 2. 일정 검색");
		System.out.println("| 3. 달력 보기");
		System.out.println("| h. 도움말 q. 종료");
		System.out.println("+----------------------+");

	}

	public static void runPrompt() {
		printMenu();
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();

		boolean isLoop = true;
		while (isLoop) {
			System.out.println("명령 (1,2,3,h,q)");
			String cmd = scanner.next();
			switch (cmd) {
			case "1":
				System.out.println("cmd  " + cmd);
				cmdRegister(scanner, cal);
				break;
			case "2":
				System.out.println("cmd  " + cmd);
				cmdSearch(scanner, cal);
				break;
			case "3":
				System.out.println("cmd  " + cmd);
				cmdCal(scanner, cal);
				break;
			case "h":
				System.out.println("cmd  " + cmd);
				printMenu();
				break;
			case "q":
				System.out.println("cmd  " + cmd);
				isLoop = false;
				break;
			}
		}
		System.out.println("bye!!");
		scanner.close();
	}

	public static void cmdRegister(Scanner s, Calendar c) {
		System.out.println("[새 일정 등록]");
		System.out.println("날짜를 입력해 주세요 (yyyy-MM-dd).");
		String date = s.next();
		String text = "";
		s.nextLine(); //ignore one newline
		System.out.println("일정을 입력해 주세요.");
		text = s.nextLine();
		c.registerPlan(date, text);
	}

	public static void cmdSearch(Scanner s, Calendar c) {
		System.out.println("[일정 검색] ");
		System.out.println("날짜를 입력해 주세요 (yyyy-MM-dd).");
		String date = s.next();
		String plan = "";
		plan = c.searchPlan(date);
		System.out.println(plan);

	}

	private static void cmdCal(Scanner s, Calendar c) {
		int year = 2017;
		int month = 1;
		System.out.println("년도를 입력하세요. (-1 : 종료)");
		System.out.print("YEAR > ");
		year = s.nextInt();

		System.out.println("달을 입력하세요");
		System.out.print("MONTH > ");
		month = s.nextInt();

		if (month > 12 || month < 1) {
			System.out.println("잘못된 달 입니다.");
			return;
		}

		//		System.out.println("[일정 등록] 날짜를 입력하세요.");
		//		System.out.println(DEFALT_CONSOL);

	}

	public static void main(String[] args) {
		Prompt p = new Prompt();
		runPrompt();

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

		//-------------------------------------------------------
		//			System.out.println("년도를 입력하세요. (-1 : 종료)");
		//			System.out.print("YEAR > ");
		//			int year = scanner.nextInt();
		//			if (year == -1) {
		//				break;
		//			}
		//			System.out.println("달을 입력하세요");
		//			System.out.print("MONTH > ");
		//			int month = scanner.nextInt();
		//			//시작하는 요일을 계산
		//
		//			int weekDay = calendar.startWeekDay(year, month);
		//
		//				//달력을 표시
		//				calendar.printCalendar(year,month,weekDay);
		//		}
		//----------------------------------------------------------
		System.out.println("bye!");

	}

}
