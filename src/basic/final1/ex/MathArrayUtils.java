package final1.ex;

public class MathArrayUtils {
	
	private MathArrayUtils() {
		//�ν��Ͻ� ������ ���´�
	}
	
	public static int sum(int[] values) {
		int total = 0;
		for(int v : values) {
			total += v;
		}
		return total;
	}
	
	public static int average(int[] values) {
		return sum(values) /values.length;
	}
	
	public static int min(int[] values) {
		int min = values[0];
		for(int v : values) {
			if(min > v)min = v;
		}
		return min;
	}


	public static int max(int[] values) {
		int max = values[0];
		for(int v : values) {
			if(max < v)max = v;
		}
		return max;
	}
}
