package HM2;

import HM1.FamilyTree;

public class Main {
    public static void main(String[] args) {
        FamTree grandfather = new FamTree("Анатолий", 1941);
        FamTree grandmother = new FamTree("Клавдия", 1945);
        FamTree father = new FamTree("Николай", 1970);
        FamTree mother = new FamTree("Екатерина", 1972);
        FamTree child = new FamTree("Стас", 1995);

        child.setFather(father);
        child.setMother(mother);
        father.setFather(grandfather);
        father.setMother(grandmother);


        System.out.println(child.toString());
    }
}
