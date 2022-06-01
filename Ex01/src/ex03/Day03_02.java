package ex03;

import java.util.Scanner;

public class Day03_02 {

	public static void main(String[] args) {
		/*
		 * # 최대값 구하기[1단계] 
		 * 1. 숫자 3개를 입력받는다. 
		 * 2. 입력받은 3개의 수를 비교하여, 
		 * 3. 가장 큰 수(MAX)를 출력한다.
		 */
		Scanner scan = new Scanner(System.in);

		System.out.println("숫자 3개를 입력하시오");

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
		
//		System.out.println("숫자 3개를 입력하시오");
//
//		int num1 = scan.nextInt();
//		int num2 = scan.nextInt();
//		int num3 = scan.nextInt();
//
//		// num1이 가장 클때
//		if (num1 > num2 && num1 > num3) {
//			System.out.println("입력한 3개의 숫자중 최대값은" + num1 + "입니다");
//		}
//		// num2가 가장 클때
//		if (num2 > num1 && num2 > num3) {
//			System.out.println("입력한 3개의 숫자중 최대값은" + num2 + "입니다");
//		}
//		// num3이 가장 클때
//		if (num3 > num1 && num3 > num2) {
//			System.out.println("입력한 3개의 숫자중 최대값은" + num3 + "입니다");
//		}
//			if (num1 == num2 && num2 == num3) {
//			System.out.println("입력한 3개의 숫자중 최대값은" + num1 + "입니다");
//		
//		}
		
}
			

}
