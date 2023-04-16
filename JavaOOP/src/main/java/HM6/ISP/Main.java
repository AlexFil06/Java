package HM6.ISP;

public class Main {
    public static void main(String[] args) {
        Fish shark = new Shark();
        shark.move();
        shark.swim();

        Snake anaconda = new Anaconda();
        anaconda.move();
        anaconda.creeps();
    }

}
