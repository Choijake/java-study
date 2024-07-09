package extends1.overriding;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ElectronicCar electronicCar = new ElectronicCar();
		electronicCar.move();

		GasCar gasCar = new GasCar();
		gasCar.move();
	}

}
