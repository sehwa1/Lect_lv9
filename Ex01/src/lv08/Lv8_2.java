package lv08;

import java.util.ArrayList;
import java.util.Scanner;

public class Lv8_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		ArrayList<Integer> arr = new ArrayList<>();		

		while(true){
            // 전체출력
			for (Integer i : arr) {
				System.out.print(i + " ");
			}
			System.out.println();
			
			// 1.추가 2.인덱스로삭제 3.값으로삭제 3.삽입 4.종료
			System.out.println("1.추가");
			System.out.println("2.삭제(인덱스)");
			System.out.println("3.삭제(값)");
			System.out.println("4.삽입");
			System.out.println("5.종료");
			
			int sel = scan.nextInt();
			
			if (sel == 1) {
				System.out.print("추가할 값 : ");
				int data = scan.nextInt();
				arr.add(data);
			}
			
			else if (sel == 2) {
				System.out.print("인덱스 : ");
				int idx = scan.nextInt();
				if (idx >= 0 && idx < arr.size()) {
					arr.remove(idx);
				}
			}
			else if (sel == 3) {
				System.out.print("값 : ");
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
			System.out.print("인덱스 : ");
			int idx = scan.nextInt();
			System.out.print("값 : ");
			int data = scan.nextInt();
			if (idx >= 0 && idx < arr.size()) {
				arr.add(idx, data);
			}
			}
			else if (sel == 5) {
				break;
			}
			else
				System.out.println("1~5의 숫자를 입력해주세요");
		}

	}

}
