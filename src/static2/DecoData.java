package static2;

public class DecoData {
	private int instanceValue;
	private static int staticValue;
	
	public static  void staticCall() {
		//instanceValue++; //static은 인스턴스 변수나 메서드 접근 불가
		staticValue++; //정적 변수 접근
		staticMethod(); //정적 메서드 접근
	}
	
	public void instanceCall() {
		instanceValue++; //인스턴스 변수 접근
		instanceMethod(); //인스턴스 메서드 접근
		
		//인스턴스, 정적 변수와 메서드 모두 접근 가능
		staticValue++;
		staticMethod();
	}
	
	private void instanceMethod() {
		System.out.println(instanceValue);
	}
	
	private static void staticMethod() {
		System.out.println(staticValue);
	}
	
}
