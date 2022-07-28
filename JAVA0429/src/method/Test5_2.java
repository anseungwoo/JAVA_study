package method;

public class Test5_2 {

	public static void main(String[] args) {
		/*
		 * 매개변수만 있고, 리턴값은 없는 메서드
		 * -------------------------------------------------------
		 * calculator() 메서드 정의
		 * 정수 2개(제품 가격, 금액)를 전달받아
		 * 손님에게 내줘야하는 거스름돈 계산하여 출력기
		 * 단, 제품가격이 금액보다 클 경우 "금액이 모자랍니다!" 출력
		 * -------------------------------------------------------
		 * ex) 제품 가격이 3500원이고, 금액이 5000원일 경우 = "거스름돈 : 1500원"
		 * ex2) 제품 가격이 5000원이고, 금액이 3000원일 경우 = "금액이 모자랍니다!"
		 * --------------------------------------------------------------------
		 */
		calculator(3500, 10000);
		System.out.println("------------------");
		
		/*
		 * 제품가격과 금액 전달하면 거스름돈 계산하는 작업은 calculator() 메서드와 동일하나
		 * 거스름돈 출력 후 각 금액권별로 몇 개씩 전달해야하는지 계산 후 출력
		 * => 팁 : 나눗셈 연산자(/) 와 나머지 연산자(%) 활용
		 * ex) 제품 가격이 3500원이고, 금액이 5000원일 경우 
		 *     1) "거스름돈 : 1500원" 출력
		 *     2) 1000원, 500원, 100원, 50원, 10원에 해당하는 금액을 
		 *        각각 몇 개씩 줘야하는지 계산 후 출력
		 *        => 거스름돈이 1500원이므로
		 *           1000원 : 1개(1500 - 1000 = 500원 남음)
		 *            500원 : 1개(500 - 500 = 0원 남음)
		 *            100원 : 0개(더 이상 다른 금액권 불필요)
		 *             50원 : 0개
		 *             10원 : 0개 
		 * ex) 제품 가격이 1730원이고, 금액이 5000원일 경우
		 *     1) "거스름돈 : 3270원" 출력
		 *     2) 거스름돈이 3270원이므로
		 *           => 3270 - 3000 의 계산이므로 1000원짜리 3장 필요
		 *           1000원 : 3개(3270 - 3000 = 270원 남음)
		 *            500원 : 0개(270 - 500 이 불가능하므로 0개)
		 *            100원 : 2개(270 - 200 = 70원 남음)
		 *             50원 : 1개(70 - 50 = 20원 남음)
		 *             10원 : 2개(20 - 20 = 0원 남음)
		 */
		calculator2(1730, 5000);
		
	}
	
	public static void calculator2(int price, int money) {
		int x = 10;
		
		// 전달받은 금액(money)에서 제품가격(price)을 뺀 금액 판별
		if(money - price < 0) { // 금액이 모자랄 경우
			System.out.println("금액이 모자랍니다!");
		} else {
			int result = money - price;
			System.out.println("거스름돈 : " + result + "원");
			
			// 거스름돈 금액권 계산
			// 1) 거스름돈 중 1000원짜리 갯수 계산(거스름돈을 1000 으로 나눈 몫 계산)
			System.out.println("1000원 : " + (result / 1000) + "장");
			// 2) 나머지 연산자를 활용하여 상위 금액권을 제외한 나머지 거스름돈 계산
			result %= 1000; // 1000원짜리 금액만큼 뺀 나머지 금액 계산
			
			// 3) 다음 금액권에 대한 계산 작업 동일하게 반복
			System.out.println("500원 : " + (result / 500) + "개");
			result %= 500;

			System.out.println("100원 : " + (result / 100) + "개");
			result %= 100;

			System.out.println("50원 : " + (result / 50) + "개");
			result %= 50;

			System.out.println("10원 : " + (result / 10) + "개");
			result %= 10;
		}
	}

	public static void calculator(int price, int money) {
		// 전달받은 금액(money)에서 제품가격(price)을 뺀 금액 판별
		if(money - price < 0) { // 금액이 모자랄 경우
			System.out.println("금액이 모자랍니다!");
		} else {
			int result = money - price;
			System.out.println("거스름돈 : " + result + "원");
		}
		
				
	}
	
	
}













