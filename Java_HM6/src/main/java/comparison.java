public class comparison {
    public static void main(String[] args) {
        Laptops laptop0 = new Laptops("ASUS", "black", 8, 4, 29990);
        Laptops laptop1 = new Laptops("ASUS", "red", 16, 6, 39990);
        Laptops laptop2 = new Laptops("Acer", "black", 8, 4, 29990);
        Laptops laptop3 = new Laptops("Acer", "blue", 16, 6, 39990);
        Laptops laptop4 = new Laptops("Dell", "silver", 8, 4, 29990);
        Laptops laptop5 = new Laptops("Dell", "black", 16, 6, 39990);

//        laptop0.preview();
//        laptop5.preview();

        if (laptop0.equals(laptop4)) {
            System.out.println("Производительность ноутбуков одинаковая");
        }
        else if (laptop0.getCore() > laptop4.getCore() && laptop0.getRam() > laptop4.getRam()) {
            System.out.println("Ноутбук со следующими характеристиками мощнее:");
            laptop0.preview();
        }
        else {
            System.out.println("Ноутбук со следующими характеристиками мощнее:");
            laptop4.preview();
        }

        if (laptop0.equals(laptop3)) {
            System.out.println("Производительность ноутбуков одинаковая");
        }
        else if (laptop0.getCore() > laptop3.getCore() && laptop0.getRam() > laptop3.getRam()) {
            System.out.println("Ноутбук со следующими характеристиками мощнее:");
            laptop0.preview();
        }
        else {
            System.out.println("Ноутбук со следующими характеристиками мощнее:");
            laptop3.preview();
        }
    }
}
