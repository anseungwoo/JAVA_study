package wrapper_class;

public class Ex4 {

	public static void main(String[] args) {
		
		
		
		
		int iNum=1235;
		System.out.println(Integer.toBinaryString(iNum));
		System.out.println(Integer.toOctalString(iNum));
		System.out.println(Integer.toHexString(iNum));
		
		
		char ch= 'R';
		
		if(ch>='A' && ch<='Z') {
			System.out.println("대문자");
		}else if(ch>='a' && ch<='z') {
			System.out.println("소문자");
		}
		
		ch=' ';
		
		if(Character.isUpperCase(ch)) {
			System.out.println(Character.toLowerCase(ch));
			
		}else if(Character.isLowerCase(ch)) {
			
			System.out.println(Character.isUpperCase(ch));
		}else if(Character.isDigit(ch)) {
			System.out.println(ch);
			
		}else if(Character.isWhitespace(ch)) {
			System.out.println(ch);
		}
		
	}

}
