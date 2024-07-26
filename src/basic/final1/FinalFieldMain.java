package final1;

public class FinalFieldMain {

	public static void main(String[] args) {
		//생성자 초기화
		System.out.println("생성자 초기화");
		ConstructInit construct1 = new ConstructInit(10);
		System.out.println(construct1.value);
		
		//필드 초기화
		FieldInit fieldInit1 = new FieldInit();
		System.out.println(fieldInit1.value);
		
		//상수 
		System.out.println(FieldInit.CONST_VALUE);
	}
}
