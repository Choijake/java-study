package poly.poly_ex4;

public class Dog extends AbstractAnimal{

	@Override
	public void sound() {
		System.out.println("bark");
	}
	
	@Override
	public void move() {
		System.out.println("dog moving");
	}
	
}
