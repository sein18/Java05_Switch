package com.silsub1;

import java.util.Scanner;

public class Munjae {
	 public void test1(){
		 Scanner sc= new Scanner(System.in);
		 System.out.print("���� ������ : ");
		 int kor=sc.nextInt();
		 System.out.print("���� ������ : ");
		 int eng=sc.nextInt();
		 System.out.print("���� ������ : ");
		 int math=sc.nextInt();
		 
		 int sum=kor+eng+math;
		 double avg = sum/3.0;
		 if(kor >= 40 && eng >= 40 && math >= 40) {
			 if(avg>=60) {
				 System.out.println(" �հ�!!  ����: "+ kor +" ����: " + eng + " ����: " + math + "  " + avg);
			 }
			 else {
				 System.out.println("���");
			 }
		 }
		 else {
			 System.out.println("���հ�");
		 }
		 sc.close();
	 }
	 
	 public void test2(){
		 Scanner sc= new Scanner(System.in);
		 System.out.println("***�ʱ� �޴�***");
		 System.out.println("1. �Է�");
		 System.out.println("2. ����");
		 System.out.println("3. ��ȸ");
		 System.out.println("4. ����");
		 System.out.println("7. ����");
		 System.out.print("�޴� ��ȣ �Է�: ");
		 int num = sc.nextInt();
		 switch(num) {
		 case 1:
			 System.out.println("�Է¸޴��� ���õǾ����ϴ�.");
			 break;
		 case 2:
			 System.out.println("�����޴��� ���õǾ����ϴ�.");
			 break;
		 case 3:
			 System.out.println("��ȸ�޴��� ���õǾ����ϴ�.");
			 break;
		 case 4:
			 System.out.println("�����޴��� ���õǾ����ϴ�.");
			 break;
		 case 7:
			 System.out.println("���α׷��� ����Ǿ����ϴ�.");
			 break;
			 default :
				 System.out.println("��ȣ�� �߸� �ԷµǾ����ϴ�.\n�ٽ� �Է��Ͻʽÿ�.");
				 break;
		 }
		 sc.close();
	 }
	 
	 public void test3(){
		 Scanner sc = new Scanner(System.in);
		 System.out.print("���� �ϳ� �Է� : ");
		 int i=sc.nextInt();
		 if(i>0) {
			 System.out.println("�����.");
		 }
		 else {
			 System.out.println("����� �ƴϴ�");
		 }
		 sc.close();
	 }
	 
	 public void test4(){
		 Scanner sc = new Scanner(System.in);
		 System.out.print("���� �ϳ� �Է� : ");
		 int i=sc.nextInt();
		 if(i%2==0) {
			 System.out.println("¦����.");
		 }
		 else {
			 System.out.println("Ȧ����.");
		 }
		 sc.close();
		 
	 }

	 public void inputTest(){ 
		 Scanner sc = new Scanner(System.in);
		 System.out.print("�̸� �Է� : ");
		 String name = sc.nextLine();
		 System.out.print("���� �Է� : ");
		 int age = sc.nextInt();
		 System.out.print("Ű �Է� : ");
		 double key = sc.nextDouble();
		 
		 if(name != null && name.length() > 0 && age > 0 && key > 0)
		 System.out.println(name + "�� ���̴� "+age+"���̰�, Ű�� "+key+" cm �̴�. ");
		 sc.close();
	 }

	 public void test6(){
		 Scanner sc = new Scanner(System.in);
		 System.out.print("ù��° ���� : ");
		 int num1 = sc.nextInt();
		 System.out.print("�ι�° ���� : ");
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
		 System.out.print("���� �Է� : ");
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
