package static2;

public class DecoDataMain {

	public static void main(String[] args) {
		System.out.println("static call : ");
		DecoData.staticCall();
		
		System.out.println("instatnce call : ");
		DecoData data1 = new DecoData();
		data1.instanceCall();

	}  

}
