package wrapper_class;

import java.util.Arrays;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test5 ex=new Test5();
		String strl="hello";
		
		char[] ch =strl.toCharArray();
		System.out.println("암호화  하지 않은 값 : "+ Arrays.toString(ch));
		System.out.println("암호화 시킨 값 : "+ex.encrypt(ch));
		
		
	}
	public String encrypt(char[] ch) {
		String str="";
//		for(int i=0;i<ch.length;i++) {
//			ch[i]+=3;
//			str+=ch[i];
//		}
		for(char i: ch) {
			i+=3;
			str+=i;
		}
		return str;
		
	}

}

