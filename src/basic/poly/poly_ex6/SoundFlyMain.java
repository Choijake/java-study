package poly.poly_ex6;


public class SoundFlyMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Bird bird = new Bird();
        Chicken chicken = new Chicken();

        soundAnimal(dog);
        soundAnimal(bird);
        soundAnimal(chicken);

        flyAnimal(bird);
        flyAnimal(chicken);

        bird.move();
    }

    //AbstractAnimal 사용 가능
    private static void soundAnimal(AbstractAnimal animal) {
        animal.sound();
    }

    //fly 인터페이스가 있으면 사용가능한
    private static void flyAnimal(Fly fly){
        fly.fly();
    }
}
