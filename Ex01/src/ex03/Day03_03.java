package ex03;

import java.util.Scanner;
//import java.util.Random;
public class Day03_03 {

	public static void main(String[] args) {
		/*
		 * # ������ ����[1�ܰ�] 
		 * 1. ������ ������ �����ϱ� ����, ���� 2���� �Է¹޴´�. 
		 * 2. �Է¹��� ���ڸ� ���� ������ ������ ����Ѵ�.
		 * ��) 3 x 7 = ? 3. ������ �ش��ϴ� ������ �Է¹޴´�. 
		 * 4. ������ �� "����" �Ǵ� "��"�� ����Ѵ�.
		 */
		Scanner scan = new Scanner(System.in);
	
//			//Random Ŭ������ ��������� �ʱ�ȭ(����)
//			//�� Ŭ������ �������ִ� �޼ҵ�nextInt()�� ����Ҽ� ����
//			Random ran = new Random();
//			
//			//nextInt(������ ���� ����)
//			int ranNum = ran.nextInt(10) +1; // 0~9 (10��) �̹��� �ȿ��� ������ ����
//			
//			// �������� ����
//			// �� �ܼ� ��������� ���ؼ� ó����
//			
//			System.out.println(ranNum);
//			
//			// 1. ranNum : -3 ~ 3
//			ranNum = ran.nextInt(7) -3;
//			System.out.println(ranNum);
//			// 2. ranNum : 100 ~ 999
//			ranNum = ran.nextInt(900) +100;
//			System.out.println(ranNum);
//			// 2. ranNum : 2 ~ 9
//			ranNum = ran.nextInt(8) +2;
//			System.out.println(ranNum);
		
		System.out.print("����1 : ");
		int x = scan.nextInt();
		System.out.print("����2 : ");
		int y = scan.nextInt();
		int z = x*y;
		//��������
		System.out.printf("%d x %d = ?\n", x, y);
		
		//�����Է�
		System.out.print("���� : ");
		int answer = scan.nextInt();
		
		//����
		if(answer == z) {
			System.out.println("����");
		}
		if(answer != z) {
			System.out.println("��");
		}
		
//		System.out.println("�����ܰ���");
//		System.out.println("���� �ΰ��� �Է��� �ּ���");
//
//		int num1 = scan.nextInt();
//		int num2 = scan.nextInt();
//		if (num1 > 9 || num2 > 9 || num1 < 1 || num2 < 1) {
//			System.out.println("1 ~ 9 �� ���ڸ� �Է� �� �ּ���");
//		}
//		if (num1 <= 9 && num1 >= 1 && num2 <= 9 && num2 >= 1) {
//		System.out.println(num1 + " X " + num2 + "�� ���� ?");
//		}
//		int num3 = scan.nextInt();
//		int mul = num1 * num2;
//
//		if (num3 == mul) {
//			System.out.println("����");
//		}
//		if (num3 != mul) {
//			System.out.println("��");
//		}

	
	}

}


