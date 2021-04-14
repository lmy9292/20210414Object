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
		
		//Student stu3 =new Student(2222,"학생3");
		System.out.println("메소드 호출전");
		
		//fieldPrint 메소드 호출
		stu1.fieldPrint();
		System.out.println("메소드 호출끝");
		
		stu2.fieldPrint();
		
		Student stu3 =new Student("학생3",3333);
		stu3.fieldPrint();
		
		System.out.println("리턴있는 메소드 호출");
		//리턴이 있는 메소드를 호출할 때는 호출만하고 끝
		//끝나는 것이 아니라 리턴값을 활용하는 내용이 필요
		
		stu1.numberMethod();
		int aa=0;
		System.out.println(aa);//메소드호출전
		aa=stu1.numberMethod();
		System.out.println(aa);//메소드호출후
		
		System.out.println(stu2.numberMethod());
	}

}
