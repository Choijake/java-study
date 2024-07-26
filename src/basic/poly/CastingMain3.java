package poly;

//업캐스팅 다운캐스팅 비교
public class CastingMain3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child = new Child();
		Parent parent1 = new Child();//업캐스팅 생략 가능
		parent1.parentMethod();
	}

}
