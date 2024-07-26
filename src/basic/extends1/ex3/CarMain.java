package extends1.ex3;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ElectronicCar electronicCar = new ElectronicCar();
		electronicCar.move();
		electronicCar.charge();
		electronicCar.openDoor();

		GasCar gasCar = new GasCar();
		gasCar.move();
		gasCar.fillUp();
		gasCar.openDoor();

		HydrogenCar hydrogenCar = new HydrogenCar();
		hydrogenCar.move();
		hydrogenCar.openDoor();
	}

}
