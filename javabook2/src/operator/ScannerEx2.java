package operator;

import java.util.Scanner;

public class ScannerEx2 {
	public static void main(String[] args) {
		// 정수인 원의 반지름을 입력받아 원의 면적을 구하기
		Scanner sc = new Scanner(System.in);
		System.out.println("반지름을 입력하시오>>>");
		int radius = sc.nextInt();
		final double PI = 3.14;
		double result = radius*radius*PI;
		System.out.println("원의 면적은 " +result+"입니다");
	}
}
