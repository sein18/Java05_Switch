package com.test02;

import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력: ");
		int i = sc.nextInt();

		//1. 입력받은 수가 5의 배수이면 "5의 배수입니다."를 출력하자.
		new Test().test01(5);
		//2. 입력받은 수가 2의 배수이면서 3의 배수이면 "2와 3의 배수입니다."를 출려하자.
		// 아니면 "2와 3의 배수가 아닙니다."를 출력하자.
		new Test().test02(6);
		//3. 입력받은 문자가 소문자라면 "소문자입니다.", 대문자라면 "대문자입니다."를 출력하자.
		// lang 패키지의 Character 클래스 확인
		new Test().test03('A');
		
	}

}
