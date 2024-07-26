package construct;

public class MemberConstruct {
	String name;
	int age;
	int grade;
	
	MemberConstruct(String name, int age){
		//밑의 생성자에 grade만 50으로 해서 생성자 만듬 -> 중복 코드 삭제
		this(name, age, 50);
	}
	
	MemberConstruct(String name, int age, int grede){
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
}
