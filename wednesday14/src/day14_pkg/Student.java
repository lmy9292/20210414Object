package day14_pkg;

public class Student {
	//필드
	String name;
	//학번
	int stuNum;
	//생성자를 아무것도 쓰지 않으면 기본생성자를
	//쓸 수 있지만 기본생성자 형태가 아닌 생성자를
	//정의하면 기본생성자를 쓸 수 없음.
	//기본생성자를 쓰고 싶다면 따로 정의를 해줘야함.
	Student(){
		System.out.println("기본생성자 호출");
	}
	//매개변수가 있는 생성
	Student(String name,int stuNum){
		System.out.println("매개변수 있는 생성자 호출");
		this.name=name;
		this.stuNum=stuNum;
	}	
		
	//메소드 선언
	//리턴이 없는 메소드 선언
		/*
		 * void: 리턴이 없다는 의미
		 * 메소드이름:fieldPrint
		 * 매개변수:없음
		 */
	void fieldPrint() {
		System.out.println("메소드 호출됨");
		System.out.println(this.name);
		System.out.println(this.stuNum);
	}
	//리턴이 있는 메소드 선언
	/*
	 * int:리턴되는 값이 int
	 * 메소드이름:numberMethod
	 * 매개변수:없음
	 */
	int numberMethod() {
		int num=10;//정수형 변수
		return num;//num변수가 가진 값을 리턴해줌
	}
	
	
	
	
}	
		
	
	

	

