package HM6.ISP;

public class Shark implements Fish{
    @Override
    public void move() {
        System.out.println("Акула двигается в воде");
    }

    @Override
    public void swim() {
        System.out.println("Акула плавает");
    }
}
