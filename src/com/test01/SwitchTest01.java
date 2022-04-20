package com.test01;

import java.util.Scanner;

public class SwitchTest01 {
	//Switch
	//조건식의 값에 따라 case에서 찾아 명령을 수행
	public void test() {
		int i = 1;
		
	switch(i) {
	case 1:
		System.out.println("1입니다!");
		break;
	case 2:
		System.out.println("2입니다!!");
		break;
	case 3:
		System.out.println("3입니다!!!");
		break;
	default :
		System.out.println("1,2,3 모두 아닙니다."); 
	}
	
	//////////////////////////////////////////
	char ch ='c';
	switch(ch) {
	case 'a':
		System.out.println("a!!!!!");
		break;
	case 'b':
		System.out.println("b!!!");
		break;
	case 'c':
		System.out.println("c!");
		break;
	default:
		System.out.println("no!!!");
	}
	
	//////////////////////////////////////////
	String s= "빵";
	switch(s) {
	case "밥":
		System.out.println("밥이다!!!");
		break;
	case "빵":
		System.out.println("빵이다~");
		break;
	case "고기":
		System.out.println("고기다!!~");
		break;
	default:
		System.out.println("물");
	}
	
	//////////////////////////////////////////
	int no = 2;
	switch(no) {
	case 1:
	case 3:
		System.out.println("홀수입니다.");
		break;
	case 2:
	case 4:
		System.out.println("짝수입니다.");
		break;
	default:
		System.out.println("no!!!");
	}
	}
	
	public void tes2() {
		//키보드로 정수 하나 입력
		//정수값이 12,1,2 => 겨울 출력
		//		3,4,5 => 봄
		//		6,7,8 => 여름
		//		9,10,11 => 가을

		Scanner sc =new Scanner(System.in);
		System.out.print("월(month) 입력: ");
		int month = sc.nextInt();
		
		switch(month) {
		case 1:case 2:case 12:
			System.out.println("겨울");
			break;
		case 3:case 4:case 5:
			System.out.println("봄");
			break;
		case 6:case 7:case 8:
			System.out.println("여름");
			break;
		case 9:case 10:case 11:
			System.out.println("가을");
			break;
		default:
			System.out.println("1~12 사이의 값만 입력해 주세요.");
		}
	}
	
	public void test3() {
		// 정수 두개와 연산기호(+,-,*,/) 1개를 입력받아,
		// 연산기호에 해당하는 계산을 수행하고 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 값: ");
		int num1 = sc.nextInt();
		System.out.print("두번째 값: ");
		int num2 = sc.nextInt();
		System.out.print("연산자(+,-,*,/) : ");
		char st = sc.next().charAt(0);
		
		int res = 0;
		
		switch(st) {
		case '+': 
			res=num1+num2;
			break;
		case '-': 
			res=num1-num2;
			break;
		case '*': 
			res=num1*num2;
			break;
		case '/': 
			res=num1/num2;
			break;
		}
		
		System.out.println(num1 + " " + st + " " + num2 + " = " + res);
		
	}
	
	
	
	
	
	
	
}
