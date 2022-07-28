package operator;

public class OperationEx4 {
	public static void main(String[] args) {
		// p81 3항 연산자를 사용하여 부모님의 나이 비교하기
		int fatherAge = 45;
		int motherAge = 47;
		
		char ch;
		ch = (fatherAge > motherAge) ? 'T' : 'F';
		
		System.out.println(ch);
	}
}
