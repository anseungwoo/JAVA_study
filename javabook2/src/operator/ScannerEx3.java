package operator;

import java.util.Scanner;

public class ScannerEx3 {
	public static void main(String[] args) {
		// 초를 입력받아 ?시간 ?분 ?초로 출력하기
		Scanner sc = new Scanner(System.in);
		System.out.println("초를 입력하시오>>>");
		int time = sc.nextInt();
		
		int hour = time / 3600;
		int minute = time / 3600 % 60;
		int second = time % 3600  % 60;
		
		System.out.println(time+"초는 "+hour+"시간 "+minute+"분 "+second+"초입니다");		
	}
}
