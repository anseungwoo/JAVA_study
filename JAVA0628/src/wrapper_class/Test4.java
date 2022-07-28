package wrapper_class;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] ch ={'A','b','5',' ','#'};
		
		for(char i: ch) {
			if(Character.isUpperCase(i)) {
				System.out.println("대"+i);
				
			}else if(Character.isLowerCase(i)) {
				
				System.out.println("소"+i);
			}else if(Character.isDigit(i)) {
				System.out.println("숫"+i);
				
			}else if(Character.isWhitespace(i)) {
				System.out.println("공"+i);
			}else {
				System.out.println("기"+i);
			}
			
		}

	}

}
