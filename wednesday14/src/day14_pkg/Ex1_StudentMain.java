package day14_pkg;

public class Ex1_StudentMain {

	public static void main(String[] args) {
		//기본생성자를 이용한 객체선언
		Student stu1= new Student();
		
		stu1.name="학생1";
		stu1.stuNum=1111;
		System.out.println(stu1.name);
		System.out.println(stu1.stuNum);
		
		//매개변수가 있는 생성자를 이용한 객체선언
		Student stu2=new Student("학생2",2222);
		System.out.println(stu2.name);
		System.out.println(stu2.stuNum);
		
		
		
		
		
	}

}
