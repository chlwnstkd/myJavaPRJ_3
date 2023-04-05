package Computer_2;
class Car_1 {
    String color;
    int speed;

    void upSpeed(int value) {
        speed = speed + value;
    }

    void downSpeed(int value) {
        speed = speed - value;
    }

    String getColor() {
        return color;
    }
    int getSpeed() {
        return speed;
    }
}
public class Ex11_02 {

    public static void main(String[] args) {
        Car_1 myCar1 = new Car_1();
        myCar1.color = "빨강";
        myCar1.speed = 0;

        myCar1.upSpeed(30);
        System.out.println("자동차의1의 색상은" + myCar1.color + "이며, 현재속도는" + myCar1.speed + "km 입니다.");
        System.out.println("자동차의1의 색상은" + myCar1.getColor() + "이며, 현재속도는" + myCar1.getSpeed() + "km 입니다.");

        myCar1.downSpeed(20);
        System.out.println("자동차의1의 색상은" + myCar1.color + "이며, 현재속도는" + myCar1.speed + "km 입니다.");
        System.out.println("자동차의1의 색상은" + myCar1.getColor() + "이며, 현재속도는" + myCar1.getSpeed() + "km 입니다.");

    }
}
