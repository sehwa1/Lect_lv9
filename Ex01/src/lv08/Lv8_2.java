package lv08;

import java.util.ArrayList;
import java.util.Scanner;

public class Lv8_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		ArrayList<Integer> arr = new ArrayList<>();		

		while(true){
            // ��ü���
			for (Integer i : arr) {
				System.out.print(i + " ");
			}
			System.out.println();
			
			// 1.�߰� 2.�ε����λ��� 3.�����λ��� 3.���� 4.����
			System.out.println("1.�߰�");
			System.out.println("2.����(�ε���)");
			System.out.println("3.����(��)");
			System.out.println("4.����");
			System.out.println("5.����");
			
			int sel = scan.nextInt();
			
			if (sel == 1) {
				System.out.print("�߰��� �� : ");
				int data = scan.nextInt();
				arr.add(data);
			}
			
			else if (sel == 2) {
				System.out.print("�ε��� : ");
				int idx = scan.nextInt();
				if (idx >= 0 && idx < arr.size()) {
					arr.remove(idx);
				}
			}
			else if (sel == 3) {
				System.out.print("�� : ");
				int data = scan.nextInt();
				
				int size = arr.size();
				while(true) {
					arr.remove(new Integer(data));
					
					if (size == arr.size()) {
						break;
					}
					else
						size = arr.size();
				}
				
//				arr.remove(new Integer(data));
			}
			else if (sel == 4) {
			System.out.print("�ε��� : ");
			int idx = scan.nextInt();
			System.out.print("�� : ");
			int data = scan.nextInt();
			if (idx >= 0 && idx < arr.size()) {
				arr.add(idx, data);
			}
			}
			else if (sel == 5) {
				break;
			}
			else
				System.out.println("1~5�� ���ڸ� �Է����ּ���");
		}

	}

}
