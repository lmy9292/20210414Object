package day14_pkg;

public class Member {
	//필드선언
	String id;
	String password;
	String name;
	int age;
	//생성자 선언
	//기본생성자
	//생성자이름:클래스이름과 동일함
	Member(){
		
	}
	//모든 필드를 매개변수로 하는 생성자
	//매개변수를 쓸 떄는 타입 이름을 써줘야한다
	Member(String id,String password,String name,int age) {
		//매개변수로 받은 값을 각각 필드에 저장
		this.id=id;
		this.password=password;
		this.name=name;
		this.age=age;
	}
	//메소드 선언
	//필드를 쓸 때는 this를 붙여준다
	void info() {
		System.out.println(this.id);
		System.out.println(this.password);
		System.out.println(this.name);
		System.out.println(this.age);
			}
	
	void update(String name) {
		this.name=name;
		
	}
	
	String myName() {
		return this.name;
	}
}
