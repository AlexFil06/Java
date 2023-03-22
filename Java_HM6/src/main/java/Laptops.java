import java.util.Objects;

//Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
//Создать множество ноутбуков (ArrayList).
//Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям. Например, спросить у
//пользователя минимальный размер оперативной памяти или конкретный цвет. Выводить только те ноутбуки,
//что соответствуют условию
public class Laptops {
    private String brand;
    private String color;
    private int ram;
    private int core;
    private int price;


    public Laptops(String brand, String color, int ram, int core, int price) {
        this.brand = brand;
        this.color = color;
        this.ram = ram;
        this.core = core;
        this.price = price;
    }


    void preview() {
        System.out.printf("%s: %s%n%s: %s%n%s: %d%n%s: %d%n%s: %d%n",
                "Производитель", brand, "Цвет", color, "RAM", ram, "Количество ядер", core, "Цена", price);
        System.out.println();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptops laptop = (Laptops) o;
        return Objects.equals(ram, laptop.ram) && Objects.equals(core, laptop.core);
    }

    public int getRam() {
        return ram;
    }

    public int getCore() {
        return core;

    }
}

