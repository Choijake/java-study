package final1;

public class finalLocalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int data1 = 10; //최초의 초기화만 가능
		
		final int data2 = 10;
	}
	
	static void method(final int parameter) {
		//parameter = 20; //값 변경 불가
	}

}
