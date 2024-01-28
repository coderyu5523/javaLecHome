package ex04;

class Car {
    String color ;
    int speed ;
    int gear ;

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", speed=" + speed +
                ", gear=" + gear +
                '}';
    }
    void changeGear(int g){
        this.gear = g;
    }
    void speedUp(){
        this.speed = speed +10;
    }
    void speedDown(){
        this.speed = speed -10;
    }

}

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car();
        car.changeGear(1);
        car.speedUp();
        System.out.println(car);

    }
}
