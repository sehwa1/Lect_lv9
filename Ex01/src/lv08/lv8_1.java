package lv08;

import java.util.ArrayList;

// 자바 
// ㄴ 컬렉션
// 1) List : 순서가 존재하는 자료구조
// 2) Map  : 순서 x, key-value pair 자료구조 

public class lv8_1 {

	public static void main(String[] args) {
		// Arraylist : 클래스 배열을 처리해주는 컬렉션
		ArrayList<Integer> arr = new ArrayList<>();

		// 추가
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		
		System.out.println(arr);
		
		// 삽입
		arr.add(1, 10);   // (인덱스, 값)
		
		System.out.println(arr);
		
		// 삭제
		
		// 인덱스로삭제
		arr.remove(1);
		System.out.println(arr);
		
		// 값으로삭제
		arr.remove(new Integer(5));
		System.out.println(arr);
		
		// 값 가져오기
		System.out.println(arr.get(0));
		
		// 내용물이 존재하는지 여부
		
		System.out.println(arr.isEmpty());
		
		// 전체값 조회
		
		for (int i=0; i<arr.size(); i++) {
			System.out.print(arr.get(i) + " ");
		}
		System.out.println();
		
		for (Integer i : arr) {
			System.out.println(i + " ");
		}
		System.out.println();
		
		// 비우기
		arr.clear(); // 내용물을 삭제
		System.out.println(arr);
		System.out.println(arr.isEmpty());
		
		// 지우기
		arr = null; // 메모리 해제
		System.out.println(arr);
	}

}
