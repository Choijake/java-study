package extends1.overriding;

public class ElectronicCar extends Car {
    //Car의 move 메서드를 재정의하여 사용
    @Override
    public void move(){
        System.out.println("전기차를 자율주행으로 이동합니다");
    }
    public void charge(){
        System.out.println("차를 충전합니다");
    }
}
