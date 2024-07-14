package poly.poly_ex2;

public class AnimalPolyMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		Cat cat = new Cat();
		Cow cow = new Cow();
		
		Animal[] animalArr = {dog, cat, cow};
		
		for(Animal animal : animalArr) {
			soundAnimal(animal);
		} 
	}
	
	
	private static void soundAnimal(Animal animal) {
		animal.sound();
	}
}
