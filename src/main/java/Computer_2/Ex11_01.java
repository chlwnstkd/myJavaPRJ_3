package Computer_2;
class Car {
    String color;
    int speed;

    void upSpeed(int value) {
        speed = speed + value;
    }

    void downspeed(int value) {
        speed = speed - value;
    }
}
public class Ex11_01 {
    public static void main(String[] args) {
        Car_1 myCar11 = new Car_1();
        myCar11.color = "빨강";
        myCar11.speed = 0;

        Car_1 myCar21 = new Car_1();
        myCar21.color = "빨강";
        myCar21.speed = 0;

        Car_1 myCar31 = new Car_1();
        myCar31.color = "노랑";
        myCar31.speed = 0;

        myCar11.upSpeed(30);
        System.out.println("자동차1의 색상은" + myCar11.color + "" + "이며, 현재속도는" + myCar11.speed + "km 입니다.");


        myCar21.upSpeed(60);
        System.out.println("자동차2의 색상은" + myCar21.color + "" + "이며, 현재속도는" + myCar21.speed + "km 입니다.");


        myCar31.upSpeed(0);
        System.out.println("자동차3의 색상은" + myCar31.color + "" + "이며, 현재속도는" + myCar31.speed + "km 입니다.");
    }

}
