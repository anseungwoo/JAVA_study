package ifExample;

public class SwitchCase1 {
	public static void main(String[] args) {
		// p103 case문 동시에 사용하기
		int month;
		String days;
		
		System.out.println(
		switch(month) {
		case 1, 3, 5, 7, 8, 10, 12 -> days = "31";
		case 2 -> days = "28";
		default -> days = "30";
		});
	}
}
