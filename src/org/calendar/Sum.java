package org.calendar;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		System.out.println("두 수를 입력하세요.");
		//사용자가 입력한 값을 문자열(String)로 받는다.
		Scanner scanner = new Scanner(System.in);
		String input1 = scanner.next();
		String input2 = scanner.next();
		//쉼표를 기준으로 분리한 문자열을 숫자로 변환한다.
		int number1 = Integer.parseInt(input1);
		int number2 = Integer.parseInt(input2);

//		int output = number1+number2;
//		System.out.println("두 수의 합은 "+ output + "입니다.");
		System.out.printf("%d와 %d의 합은 %d입니다.", number1, number2, number1+number2);
		scanner.close();


	}

}
