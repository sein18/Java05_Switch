package com.test02;

import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ� �Է�: ");
		int i = sc.nextInt();

		//1. �Է¹��� ���� 5�� ����̸� "5�� ����Դϴ�."�� �������.
		new Test().test01(5);
		//2. �Է¹��� ���� 2�� ����̸鼭 3�� ����̸� "2�� 3�� ����Դϴ�."�� �������.
		// �ƴϸ� "2�� 3�� ����� �ƴմϴ�."�� �������.
		new Test().test02(6);
		//3. �Է¹��� ���ڰ� �ҹ��ڶ�� "�ҹ����Դϴ�.", �빮�ڶ�� "�빮���Դϴ�."�� �������.
		// lang ��Ű���� Character Ŭ���� Ȯ��
		new Test().test03('A');
		
	}

}
