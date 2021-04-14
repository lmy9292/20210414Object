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
		
	}
	//매개변수가 있는 생성
	Student(String name,int stuNum){
		this.name=name;
		this.stuNum=stuNum;
	}
}
