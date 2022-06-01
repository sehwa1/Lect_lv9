package ex03;

import java.util.Scanner;

public class Day03_01 {

	public static void main(String[] args) {
		/*
		 * # 영수증 출력[1단계] 1. 메뉴판을 출력한다. 
		 * 2. 사용자는 주문하고자 하는 메뉴의 번호를 입력한다. 
		 * 3. 현금을 입력받는다. 
		 * 4.입력받은 현금과 메뉴가격을 확인해, 영수증을 출력한다. 
		 * 5. 단, 현금이 부족한 경우 "현금이 부족합니다."라는 메세지를 출력한다. 
		 */

		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;
		int total = 0;
		int coin = 0;
		Scanner scan = new Scanner(System.in);

		System.out.println("=== 롯데리아 ===");
		System.out.println("1.불고기 버거 : " + price1 + "원");
		System.out.println("2.새우    버거 : " + price2 + "원");
		System.out.println("3.콜         라 : " + price3 + "원");

		System.out.print("주문하실 메뉴번호를 입력해주세요 : ");
		int num = scan.nextInt();
		
		// 선택한 메뉴의 가격을 보여주고,
		//현금을 입력받기
		if (num == 1) {
//			System.out.println("가격 : " + price1 + "원");
			System.out.printf("가격 : %d원\n", price1);
		    total = price1;
		}
	    if (num == 2) {
				System.out.printf("가격 : %d원\n", price2);	
				total = price2;
	    }		
		if (num == 3) {
				System.out.printf("가격 : %d원\n", price3);		
				total = price3;
		}
		
		System.out.print("현금 : ");
		int money = scan.nextInt();
		
		//검증
		if (money == total) {
			System.out.println("=== 영수증 ===");
		    coin = money - total;
			
//            if(money == total) {
//            	coin = money - total;
//        }
//            //영수증 출력
//            // 구매한 품목 / 수량 / 소개
//            // 총액
//            //잔돈
//            System.out.println("-----영수증-----");
			if(num == 1) {
				System.out.printf("불고기버거 1개\t%d원\n", price1);
		    }
			if(num == 2) {
				System.out.printf("새우버거 1개\t%d원\n", price2);
			}
			if(num == 3) {
				System.out.printf("콜라 1개\t%d원\n", price3);
			}
			System.out.println("--------------");
			System.out.printf("투입금액 : %d원\n", money);
			System.out.printf("잔액 : %d원\n", coin);
			System.out.println("--------------");
			System.out.println("이용해 주셔서 감사합니다");
		}
			if(money > total) {			
				coin = money - total;
				if(num == 1) {
					System.out.printf("불고기버거 1개\t%d원\n", price1);
					
				}
				if(num == 2) {
					System.out.printf("새우버거 1개\t%d원\n", price2);
				}
				if(num == 3) {
					System.out.printf("콜라 1개\t%d원\n", price3);
				}
				System.out.println("--------------");
				System.out.printf("총액 : %d원\n", money);
				System.out.printf("잔액 : %d원\n", coin);
				System.out.println("--------------");
				System.out.println("이용해 주셔서 감사합니다");
			}
				
			if (money < total) { 
				System.out.println("현금이 부족합니다");
			}

//			System.out.println("=== 롯데리아 ===");
//			System.out.println("1.불고기 버거 : " + price1 + "원");
//			System.out.println("2.새우    버거 : " + price2 + "원");
//			System.out.println("3.콜         라 : " + price3 + "원");
//
//			System.out.print("주문하실 메뉴번호 입력해주세요 : ");
//			int num = scan.nextInt();
//
//			if (num == 1) {
//				System.out.println(price1 + "원을 투입(입력)해 주세요");
//			}
//			if (num == 2) {
//				System.out.println(price2 + "원을 투입(입력)해 주세요");
//			}
//			if (num == 3) {
//				System.out.println(price3 + "원을 투입(입력)해 주세요");
//			}
//			if (num > 3 || num <= 0) {
//				System.out.println("잘못 입력 하셨습니다.");
//			}
//
//			int cash = scan.nextInt();
//
//			if (cash == price1 && num == 1) {
//				System.out.println(price1 + "원 결제완료");
//			}
//			if (num == 1 && cash < price1) {
//				System.out.println("현금이 부족합니다");
//			}
//			if (num == 1 && cash > price1) {
//				System.out.println("잔돈 " + (cash - price1) + "원" + " 거슬러 드리겠습니다.");
//			}
//
//			if (cash == price2 && num == 2) {
//				System.out.println(price2 + "원 결제완료");
//			}
//			if (num == 2 && cash < price2) {
//				System.out.println("현금이 부족합니다");
//			}
//			if (num == 2 && cash > price2) {
//				System.out.println("잔돈 " + (cash - price2) + "원" + " 거슬러 드리겠습니다.");
//			}
//			if (cash == price3 && num == 3) {
//				System.out.println(price3 + "원 결제완료");
//			}
//			if (num == 3 && cash < price3) {
//				System.out.println("현금이 부족합니다");
//			}
//			if (num == 3 && cash > price3) {
//				System.out.println("잔돈 " + (cash - price3) + "원" + " 거슬러 드리겠습니다.");
//			}
//		
//		}
//
//	}

}
			

}
