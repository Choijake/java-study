package static1;

public class DataCountMain2 {
	public static void main(String[] args) {
		Counter counter = new Counter();
		new Data2("A", counter);
		System.out.print(counter.count);
		
		Data2 data2 = new Data2("B", counter);   
	}
}
