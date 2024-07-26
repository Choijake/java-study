package poly.poly_ex5;

public class InterfaceMain {

	public static void main(String[] args) {
		//�������̽��� �߻��̶� �ν��Ͻ� ���� �Ұ�
		//InterfaceAnimal interfaceAnimal = new InterfaceAnimal();
		
		Cat cat = new Cat();
		Dog dog = new Dog();
		Cow cow = new Cow();
		
		soundAnimal(cat);
		soundAnimal(dog);
		soundAnimal(cow);
	}

	private static void soundAnimal(InterfaceAnimal animal) {
		animal.sound();
	}
}
