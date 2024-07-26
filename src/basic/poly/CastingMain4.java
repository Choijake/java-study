package poly;

//다운캐스팅을 자동으로 하지 않는 이유
public class CastingMain4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent parent1 = new Child(); 
		Child child1 = (Child)parent1; //다운캐스팅
		
		Parent parent2 = new Parent();
		Child child2 = (Child)parent2;
		child2.childMethod(); //Child 객체는 생성되지 않기 때문에 메서드를 사용할 수 없어서 런타임 오류가 발생함
	}

}
