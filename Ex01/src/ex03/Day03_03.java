package ex03;

import java.util.Scanner;
//import java.util.Random;
public class Day03_03 {

	public static void main(String[] args) {
		/*
		 * # 구구단 게임[1단계] 
		 * 1. 구구단 문제를 출제하기 위해, 숫자 2개를 입력받는다. 
		 * 2. 입력받은 숫자를 토대로 구구단 문제를 출력한다.
		 * 예) 3 x 7 = ? 3. 문제에 해당하는 정답을 입력받는다. 
		 * 4. 정답을 비교 "정답" 또는 "땡"을 출력한다.
		 */
		Scanner scan = new Scanner(System.in);
	
//			//Random 클래스를 변수에담아 초기화(생성)
//			//ㄴ 클래스가 가지고있는 메소드nextInt()를 사용할수 있음
//			Random ran = new Random();
//			
//			//nextInt(난수의 범주 개수)
//			int ranNum = ran.nextInt(10) +1; // 0~9 (10개) 이범위 안에서 랜덤값 추출
//			
//			// 시작점의 보정
//			// ㄴ 단순 산술연산을 통해서 처리함
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
		
		System.out.print("숫자1 : ");
		int x = scan.nextInt();
		System.out.print("숫자2 : ");
		int y = scan.nextInt();
		int z = x*y;
		//문제출제
		System.out.printf("%d x %d = ?\n", x, y);
		
		//정답입력
		System.out.print("정답 : ");
		int answer = scan.nextInt();
		
		//검증
		if(answer == z) {
			System.out.println("정답");
		}
		if(answer != z) {
			System.out.println("땡");
		}
		
//		System.out.println("구구단게임");
//		System.out.println("숫자 두개를 입력해 주세요");
//
//		int num1 = scan.nextInt();
//		int num2 = scan.nextInt();
//		if (num1 > 9 || num2 > 9 || num1 < 1 || num2 < 1) {
//			System.out.println("1 ~ 9 의 숫자를 입력 해 주세요");
//		}
//		if (num1 <= 9 && num1 >= 1 && num2 <= 9 && num2 >= 1) {
//		System.out.println(num1 + " X " + num2 + "의 답은 ?");
//		}
//		int num3 = scan.nextInt();
//		int mul = num1 * num2;
//
//		if (num3 == mul) {
//			System.out.println("정답");
//		}
//		if (num3 != mul) {
//			System.out.println("땡");
//		}

	
	}

}


