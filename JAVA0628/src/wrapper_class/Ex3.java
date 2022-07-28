package wrapper_class;

public class Ex3 {

	public static void main(String[] args) {

		/*
		 * 문자열 -> 기본 데이터 타입으로 변환
		 * - 주로 웹에서 form 태그로 데이터를 입력받거나
		 *	 자바, 안드로이드 등 GUI  환경
		 * 
		 * */
		
		
		String strNum="100.0";
//		int iNum= Integer.parseInt(strNum);
//		int i =100.0; //동일함
		
		double dNum =Double.parseDouble(strNum);
		System.out.println(dNum);
		Double dNum2 =new Double(strNum);
		System.out.println(dNum2);
		
		
		float fNum=Float.parseFloat(strNum);
		System.out.println(fNum);
		
		
		String strNum2="100";
		int iNum =Integer.parseInt(strNum2);
		System.out.println(iNum);
		
		
		
		
		
	}

}
