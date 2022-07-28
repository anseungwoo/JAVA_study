package operator;

import java.util.Scanner;

public class ScannerEx1 {
	public static void main(String[] args) {
		// 점수 구하기
		// 60점 이상은 통과, 미만은 다음 기회에
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하시오>>>");
		int input = sc.nextInt();
		String result = input >= 60 ? "통과" : "다음 기회에";
		
		System.out.println(result);
	}
}
