package ex03;

import java.util.Scanner;

public class Day03_02 {

	public static void main(String[] args) {
		/*
		 * # �ִ밪 ���ϱ�[1�ܰ�] 
		 * 1. ���� 3���� �Է¹޴´�. 
		 * 2. �Է¹��� 3���� ���� ���Ͽ�, 
		 * 3. ���� ū ��(MAX)�� ����Ѵ�.
		 */
		Scanner scan = new Scanner(System.in);

		System.out.println("���� 3���� �Է��Ͻÿ�");

		int x = scan.nextInt();
		int y = scan.nextInt();
		int z = scan.nextInt();
		
		// x > y
		// y > z
		// z > x
		
		int max = 0;
		
		// ?
		max = x;
		if(max < y) {
			max = y;
		}
		if(max < z) {
			max = z;
		}
		System.out.println("max : " + max);
		
//		System.out.println("���� 3���� �Է��Ͻÿ�");
//
//		int num1 = scan.nextInt();
//		int num2 = scan.nextInt();
//		int num3 = scan.nextInt();
//
//		// num1�� ���� Ŭ��
//		if (num1 > num2 && num1 > num3) {
//			System.out.println("�Է��� 3���� ������ �ִ밪��" + num1 + "�Դϴ�");
//		}
//		// num2�� ���� Ŭ��
//		if (num2 > num1 && num2 > num3) {
//			System.out.println("�Է��� 3���� ������ �ִ밪��" + num2 + "�Դϴ�");
//		}
//		// num3�� ���� Ŭ��
//		if (num3 > num1 && num3 > num2) {
//			System.out.println("�Է��� 3���� ������ �ִ밪��" + num3 + "�Դϴ�");
//		}
//			if (num1 == num2 && num2 == num3) {
//			System.out.println("�Է��� 3���� ������ �ִ밪��" + num1 + "�Դϴ�");
//		
//		}
		
}
			

}
