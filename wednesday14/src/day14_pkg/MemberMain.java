package day14_pkg;

public class MemberMain {

	public static void main(String[] args) {
		
		Member m=new Member();
		
		//매개변수가 있는 생성자를 이용한 객체
		m.id="abc";
		m.password="123asd";
		m.name="지우";
		m.age=30;
		
		m.info();
		
		m.update("피카츄");
		//System.out.println(m.myName());이것도 가능	
		String nn=m.myName();
		System.out.println(nn);
		
		
		//매개변수가 있는 생성자를 이용한 객체
		Member m2=new Member("abc","123asd","홍길동",30);
		m2.info();
		
		
		m2.update("꼬북이");
		
		String nnn=m2.myName();
		System.out.println(nnn);
	}

}
