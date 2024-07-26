package static1;

public class DataCountMain3 {

	public static void main(String[] args) {   
		//클래스 변수(정적 변수)에 직접 접근
		Data3 data1 = new Data3("A");
		System.out.println(Data3.count);
		
		Data3 data2 = new Data3("B");
		System.out.println(Data3.count);
		
		//인스턴스 통한 접근 권장하지 않음 -> 바로 정적 변수라는 생각이 안든다>>
		Data3 data4 = new Data3("D");
		System.out.println(data4.count);
		
		//클래스 통한 접근
		System.out.println(Data3.count);
	}

}
