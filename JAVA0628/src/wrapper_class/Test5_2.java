package wrapper_class;

public class Test5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		
		String passwd = "abcABC123!!!";

		char[] pass = passwd.toCharArray();
		int count = 0;
		
		boolean Up = false;
		boolean Lo = false;
		boolean Di = false;
		boolean etc = false;
		
		for (char i : pass) {
			if (!Up) {
				if (Character.isUpperCase(i)) {
					count++;
					Up = true;

				}
			}
			if (!Lo) {
				if (Character.isLowerCase(i)) {
					count++;
					Lo = true;

				}
			}
			if (!Di) {
				if (Character.isDigit(i)) {
					count++;
					Di = true;

				}
			}
			if (!etc) {
				if (i == '!') {
					count++;
					etc = true;

				}
			}

		}
		switch (count) {
		case 4:
			System.out.println("패스워드 점수 : "+count+"점, 패스워드 안전도 : 안전");
			break;
		case 3:
			System.out.println("패스워드 점수 : "+count+"점, 패스워드 안전도 : 보통");
			break;
		case 2:
			System.out.println("패스워드 점수 : "+count+"점, 패스워드 안전도 : 위험");
			break;

		default:
			System.out.println("패스워드 점수 : "+count+"점, 패스워드 안전도 : 사용불가");
			break;
		}

	}

}
