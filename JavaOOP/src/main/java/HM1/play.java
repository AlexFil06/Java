package HM1;

public class play {
    public static void main(String[] args) {
        FamilyTree grandfather = new FamilyTree("Анатолий", 1941);
        FamilyTree grandmother = new FamilyTree("Клавдия", 1945);
        FamilyTree father = new FamilyTree("Николай", 1970);
        FamilyTree mother = new FamilyTree("Екатерина", 1972);
        FamilyTree child = new FamilyTree("Стас", 1995);

        child.setFather(father);
        child.setMother(mother);
        father.setFather(grandfather);
        father.setMother(grandmother);


        System.out.println(child.toString());
        //        System.out.println(father.getChildren());
    }


}
