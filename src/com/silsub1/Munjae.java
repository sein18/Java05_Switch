package com.silsub1;

import java.util.Scanner;

public class Munjae {
	 public void test1(){
		 Scanner sc= new Scanner(System.in);
		 System.out.print("국어 점수는 : ");
		 int kor=sc.nextInt();
		 System.out.print("영어 점수는 : ");
		 int eng=sc.nextInt();
		 System.out.print("수학 점수는 : ");
		 int math=sc.nextInt();
		 
		 int sum=kor+eng+math;
		 double avg = sum/3.0;
		 if(kor >= 40 && eng >= 40 && math >= 40) {
			 if(avg>=60) {
				 System.out.println(" 합격!!  국어: "+ kor +" 영어: " + eng + " 수학: " + math + "  " + avg);
			 }
			 else {
				 System.out.println("평균");
			 }
		 }
		 else {
			 System.out.println("불합격");
		 }
		 sc.close();
	 }
	 
	 public void test2(){
		 Scanner sc= new Scanner(System.in);
		 System.out.println("***초기 메뉴***");
		 System.out.println("1. 입력");
		 System.out.println("2. 수정");
		 System.out.println("3. 조회");
		 System.out.println("4. 삭제");
		 System.out.println("7. 종료");
		 System.out.print("메뉴 번호 입력: ");
		 int num = sc.nextInt();
		 switch(num) {
		 case 1:
			 System.out.println("입력메뉴가 선택되었습니다.");
			 break;
		 case 2:
			 System.out.println("수정메뉴가 선택되었습니다.");
			 break;
		 case 3:
			 System.out.println("조회메뉴가 선택되었습니다.");
			 break;
		 case 4:
			 System.out.println("삭제메뉴가 선택되었습니다.");
			 break;
		 case 7:
			 System.out.println("프로그램이 종료되었습니다.");
			 break;
			 default :
				 System.out.println("번호가 잘못 입력되었습니다.\n다시 입력하십시오.");
				 break;
		 }
		 sc.close();
	 }
	 
	 public void test3(){
		 Scanner sc = new Scanner(System.in);
		 System.out.print("정수 하나 입력 : ");
		 int i=sc.nextInt();
		 if(i>0) {
			 System.out.println("양수다.");
		 }
		 else {
			 System.out.println("양수가 아니다");
		 }
		 sc.close();
	 }
	 
	 public void test4(){
		 Scanner sc = new Scanner(System.in);
		 System.out.print("정수 하나 입력 : ");
		 int i=sc.nextInt();
		 if(i%2==0) {
			 System.out.println("짝수다.");
		 }
		 else {
			 System.out.println("홀수다.");
		 }
		 sc.close();
		 
	 }

	 public void inputTest(){ 
		 Scanner sc = new Scanner(System.in);
		 System.out.print("이름 입력 : ");
		 String name = sc.nextLine();
		 System.out.print("나이 입력 : ");
		 int age = sc.nextInt();
		 System.out.print("키 입력 : ");
		 double key = sc.nextDouble();
		 
		 if(name != null && name.length() > 0 && age > 0 && key > 0)
		 System.out.println(name + "의 나이는 "+age+"세이고, 키는 "+key+" cm 이다. ");
		 sc.close();
	 }

	 public void test6(){
		 Scanner sc = new Scanner(System.in);
		 System.out.print("첫번째 정수 : ");
		 int num1 = sc.nextInt();
		 System.out.print("두번째 정수 : ");
		 int num2 = sc.nextInt();
		 System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
		 System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
		 System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
		 System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
		 System.out.println(num1 + " % " + num2 + " = " + (num1%num2));
		 sc.close();
	 }
	 
	 public void test7(){
		 Scanner sc = new Scanner(System.in);
		 System.out.print("점수 입력 : ");
		 int num = sc.nextInt();
		 if(num>=90) {
			 System.out.println(num + " A ");
		 }else if(num>=80) {
			 System.out.println(num + " B ");
		 }else if(num>=70) {
			 System.out.println(num + " C ");
		 }else if(num>=60) {
			 System.out.println(num + " D ");
		 }else { 
			 System.out.println(num + " F ");
		 }
		 sc.close();
	 }
}
