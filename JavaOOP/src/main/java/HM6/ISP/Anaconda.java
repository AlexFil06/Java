package HM6.ISP;

public class Anaconda implements Snake{
    @Override
    public void move() {
        System.out.println("Двигается по суше");
    }

    @Override
    public void creeps() {
        System.out.println("Анаконда ползает");
    }
}
