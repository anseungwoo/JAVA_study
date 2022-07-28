package enum_type;

public class Ex {

	public static void main(String[] args) {
		/*
		* 열거형(Enumeration Type = Enum 타입)
		* - 상수를 좀 더 확실한 형태로 다루기 위한 객체의 일종
		* - 데이터타입이 일치하면 다른 데이터라도 사용 가능한 상수의 단점을 해결
		* - enum 타입은 내부적으로 java.lang.Enum 클래스를 상속받음
		*
		* < enum 타입 선언 방법 >
		* public enum 타입명 {
		* 		상수1, 상수2, ..., 상수n
		* }
		* => 각 상수는 실제 사용할 값을 데이터타입 구분 없이 나열
		*/
		
		// enum 타입은 참조변수의 데이터타입으로도 사용 가능함
		// => 클래스와 동일
//		Week today; // Week 타입 변수 today 선언
		// => Week 타입 변수에는 Week 타입 상수만 저장 가능함
//		today = Week.FRIDAY;
		
		Week today = Week.FRIDAY;
		System.out.println(today);
		
		// Week 타입 객체는 Enum 클래스의 서브클래스 타입 객체입니까?
		if(today instanceof Enum) {
			System.out.println("Enum 클래스의 서브클래스이다!");
		}else {
			System.out.println("Enum 클래스의 서브클래스가 아니다!");
		}
		

		if(today instanceof Object) {
			System.out.println("Object 클래스의 서브클래스이다!");
		}else {
			System.out.println("Object 클래스의 서브클래스가 아니다!");
		}
		
		System.out.println("=======================================");
		
		//일반 상수를 파라미터로 사용하는 경우
		// => 동일한 데이터타입일 경우 잘못된 데이터도 전달이 가능해짐
		MyCalandar mc = new MyCalandar();
		mc.setMonth(20); // int 타입 데이터 전달 가능(잘못된 데이터)
		mc.setMonth(WeekClass.MONDAY); // 요일도 전달 가능(잘못된 데이터)
		mc.setMonth(MonthClass.JANUARY); // 정상 데이터
		
		//enum 상수를 파라미터로 사용하는 경우
		// => enum 타입 객체의 상수 외에는 그 어떤 값도 전달 불가능하므로 안전!
		MyEnumCalandar mec = new MyEnumCalandar();
//		mec.setMonth(1); // Month 타입 객체(상수값) 외의 다른 값 전달 불가!
//		mec.setMonth(Week.MONDAY); // Week 타입 상수도 전달 불가!
		mec.setMonth(Month.JANUARY);
	}

}

//요일 정보를 관리하는 enum 타입 Week 정의
//=> 하나의 파일 안에 정의 시 public 제거
enum Week {
	// 주의! 자바의 기본 데이터타입이 아니므로 그냥 값을 나열하면 됨
	MONDAY, TUESDAY,WEDNESDAY,THURDSAY,FRIDAY,SATURDAY,SUNDAY
}
 
enum Month {
	JANUARY, FEBRUARY
}

class MyEnumCalandar {
	public void setMonth(Month month) {
		System.out.println("요일 : " + month);
		
	}
}

//====================================================================
//요일 정보를 관리하는 WeekClass 클래스 정의
class WeekClass {
	// 요일 정보를 상수로 저장
	public static final int MONDAY = 1;
	public static final int TUESDAY = 2;
	public static final int WEDNESDAY = 3;
	public static final int THURDSAY = 4; 
	public static final int FRIDAY = 5; 
	public static final int SATURDAY = 6;
	public static final int SUNDAY = 7;
	
}

//월 정보를 관리하는 MonthClass 클래스 정의
class MonthClass {
	public static final int JANUARY = 1;
}

class MyCalandar {
	// setMonth() 메서드 파라미터로 int 타입을 전달받을 경우
	// MonthClass.JANUARY 값과 WeekClass.MONDAY 의 값이 동일한데
	// WeekClass.MONDAY 를 전달하면 문법적으로는 잘못되지 않으나
	// 정상적인 값이라고 볼 수 없다!
	// 하지만, 외부에서 전달하는 값에 대한 제한을 할 수 없다! (일반 상수 문제점)
	public void setMonth(int month) {
		System.out.println(month + "월");
	}
}