package HM6.ISP;

public class Falcon implements Bird{
    @Override
    public void move() {
        System.out.println("Сокол двигается по воздуху");
    }

    @Override
    public void fly() {
        System.out.println("Сокол летает");
    }
}
