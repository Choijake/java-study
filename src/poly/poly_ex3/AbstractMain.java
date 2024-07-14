package poly.poly_ex3;

public class AbstractMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//AbstractAnimal animal = new AbstractAnimal();
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		Cow cow = new Cow();
		
		soundAnimal(dog);
		soundAnimal(cat);
		soundAnimal(cow);
	}
	
	private static void soundAnimal(AbstractAnimal animal) {
		animal.sound();
	}
}
