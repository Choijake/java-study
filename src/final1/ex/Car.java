package final1.ex;

public class Car {
	private String name;
	private static int totalCars;
	
	public Car(String name) {
		this.name = name;
		System.out.println(name);
		totalCars++;
	}
	
	public static void showTotalCars() {
		System.out.println(totalCars);
	}
}
