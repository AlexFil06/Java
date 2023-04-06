package HM2;

public class Main {
    public static void main(String[] args) {
        FamTree grandfather = new FamTree("Анатолий", 1941);
        FamTree grandmother = new FamTree("Клавдия", 1945);
        FamTree father = new FamTree("Николай", 1970);
        FamTree mother = new FamTree("Екатерина", 1972);
        FamTree child = new FamTree("Стас", 1995);
        FamTree child2 = new FamTree("Маша", "04.05.1994");

        child.setFather(father);
        child.setMother(mother);
        child2.setFather(father);
        child2.setMother(mother);
        father.setFather(grandfather);
        father.setMother(grandmother);


        // System.out.println(child2.toString());

        System.out.println(father.getName() + " имеет " + father.getChildren().size() + " детей.");
        System.out.println(mother.getName() + " имеет " + mother.getChildren().size() + " детей.");
        System.out.println(child.getName() + " рожден(а) в " + child.getBirthYear() + "год" + " имеет мать " + child.getMother().getName() + " и отца " + child.getFather().getName());
        System.out.println(child2.getName() + " рожден(а) в " + child2.getBirthYear() + " год" +  " имеет мать " + child2.getMother().getName() + " и отца " + child2.getFather().getName());




    }
}
