package lv08;

import java.util.ArrayList;

// �ڹ� 
// �� �÷���
// 1) List : ������ �����ϴ� �ڷᱸ��
// 2) Map  : ���� x, key-value pair �ڷᱸ�� 

public class lv8_1 {

	public static void main(String[] args) {
		// Arraylist : Ŭ���� �迭�� ó�����ִ� �÷���
		ArrayList<Integer> arr = new ArrayList<>();

		// �߰�
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		
		System.out.println(arr);
		
		// ����
		arr.add(1, 10);   // (�ε���, ��)
		
		System.out.println(arr);
		
		// ����
		
		// �ε����λ���
		arr.remove(1);
		System.out.println(arr);
		
		// �����λ���
		arr.remove(new Integer(5));
		System.out.println(arr);
		
		// �� ��������
		System.out.println(arr.get(0));
		
		// ���빰�� �����ϴ��� ����
		
		System.out.println(arr.isEmpty());
		
		// ��ü�� ��ȸ
		
		for (int i=0; i<arr.size(); i++) {
			System.out.print(arr.get(i) + " ");
		}
		System.out.println();
		
		for (Integer i : arr) {
			System.out.println(i + " ");
		}
		System.out.println();
		
		// ����
		arr.clear(); // ���빰�� ����
		System.out.println(arr);
		System.out.println(arr.isEmpty());
		
		// �����
		arr = null; // �޸� ����
		System.out.println(arr);
	}

}
