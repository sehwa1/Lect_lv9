package ex03;

import java.util.Scanner;

public class Day03_01 {

	public static void main(String[] args) {
		/*
		 * # ������ ���[1�ܰ�] 1. �޴����� ����Ѵ�. 
		 * 2. ����ڴ� �ֹ��ϰ��� �ϴ� �޴��� ��ȣ�� �Է��Ѵ�. 
		 * 3. ������ �Է¹޴´�. 
		 * 4.�Է¹��� ���ݰ� �޴������� Ȯ����, �������� ����Ѵ�. 
		 * 5. ��, ������ ������ ��� "������ �����մϴ�."��� �޼����� ����Ѵ�. 
		 */

		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;
		int total = 0;
		int coin = 0;
		Scanner scan = new Scanner(System.in);

		System.out.println("=== �Ե����� ===");
		System.out.println("1.�Ұ�� ���� : " + price1 + "��");
		System.out.println("2.����    ���� : " + price2 + "��");
		System.out.println("3.��         �� : " + price3 + "��");

		System.out.print("�ֹ��Ͻ� �޴���ȣ�� �Է����ּ��� : ");
		int num = scan.nextInt();
		
		// ������ �޴��� ������ �����ְ�,
		//������ �Է¹ޱ�
		if (num == 1) {
//			System.out.println("���� : " + price1 + "��");
			System.out.printf("���� : %d��\n", price1);
		    total = price1;
		}
	    if (num == 2) {
				System.out.printf("���� : %d��\n", price2);	
				total = price2;
	    }		
		if (num == 3) {
				System.out.printf("���� : %d��\n", price3);		
				total = price3;
		}
		
		System.out.print("���� : ");
		int money = scan.nextInt();
		
		//����
		if (money == total) {
			System.out.println("=== ������ ===");
		    coin = money - total;
			
//            if(money == total) {
//            	coin = money - total;
//        }
//            //������ ���
//            // ������ ǰ�� / ���� / �Ұ�
//            // �Ѿ�
//            //�ܵ�
//            System.out.println("-----������-----");
			if(num == 1) {
				System.out.printf("�Ұ����� 1��\t%d��\n", price1);
		    }
			if(num == 2) {
				System.out.printf("������� 1��\t%d��\n", price2);
			}
			if(num == 3) {
				System.out.printf("�ݶ� 1��\t%d��\n", price3);
			}
			System.out.println("--------------");
			System.out.printf("���Աݾ� : %d��\n", money);
			System.out.printf("�ܾ� : %d��\n", coin);
			System.out.println("--------------");
			System.out.println("�̿��� �ּż� �����մϴ�");
		}
			if(money > total) {			
				coin = money - total;
				if(num == 1) {
					System.out.printf("�Ұ����� 1��\t%d��\n", price1);
					
				}
				if(num == 2) {
					System.out.printf("������� 1��\t%d��\n", price2);
				}
				if(num == 3) {
					System.out.printf("�ݶ� 1��\t%d��\n", price3);
				}
				System.out.println("--------------");
				System.out.printf("�Ѿ� : %d��\n", money);
				System.out.printf("�ܾ� : %d��\n", coin);
				System.out.println("--------------");
				System.out.println("�̿��� �ּż� �����մϴ�");
			}
				
			if (money < total) { 
				System.out.println("������ �����մϴ�");
			}

//			System.out.println("=== �Ե����� ===");
//			System.out.println("1.�Ұ�� ���� : " + price1 + "��");
//			System.out.println("2.����    ���� : " + price2 + "��");
//			System.out.println("3.��         �� : " + price3 + "��");
//
//			System.out.print("�ֹ��Ͻ� �޴���ȣ �Է����ּ��� : ");
//			int num = scan.nextInt();
//
//			if (num == 1) {
//				System.out.println(price1 + "���� ����(�Է�)�� �ּ���");
//			}
//			if (num == 2) {
//				System.out.println(price2 + "���� ����(�Է�)�� �ּ���");
//			}
//			if (num == 3) {
//				System.out.println(price3 + "���� ����(�Է�)�� �ּ���");
//			}
//			if (num > 3 || num <= 0) {
//				System.out.println("�߸� �Է� �ϼ̽��ϴ�.");
//			}
//
//			int cash = scan.nextInt();
//
//			if (cash == price1 && num == 1) {
//				System.out.println(price1 + "�� �����Ϸ�");
//			}
//			if (num == 1 && cash < price1) {
//				System.out.println("������ �����մϴ�");
//			}
//			if (num == 1 && cash > price1) {
//				System.out.println("�ܵ� " + (cash - price1) + "��" + " �Ž��� �帮�ڽ��ϴ�.");
//			}
//
//			if (cash == price2 && num == 2) {
//				System.out.println(price2 + "�� �����Ϸ�");
//			}
//			if (num == 2 && cash < price2) {
//				System.out.println("������ �����մϴ�");
//			}
//			if (num == 2 && cash > price2) {
//				System.out.println("�ܵ� " + (cash - price2) + "��" + " �Ž��� �帮�ڽ��ϴ�.");
//			}
//			if (cash == price3 && num == 3) {
//				System.out.println(price3 + "�� �����Ϸ�");
//			}
//			if (num == 3 && cash < price3) {
//				System.out.println("������ �����մϴ�");
//			}
//			if (num == 3 && cash > price3) {
//				System.out.println("�ܵ� " + (cash - price3) + "��" + " �Ž��� �帮�ڽ��ϴ�.");
//			}
//		
//		}
//
//	}

}
			

}
