package HM2;

import java.util.ArrayList;
import java.util.List;

public class FamTree implements Person{

    private String name;
    private int birthYear;
    private Person father;
    private Person mother;
    private ArrayList<Person> children;


    public FamTree(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
        children = new ArrayList<>();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }


    @Override
    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    @Override
    public Person getMother() {
        return mother;
    }

    @Override
    public void setMother(Person mother) {
        this.mother = mother;
        mother.addChild(this);
    }

    @Override
    public Person getFather() {
        return father;
    }

    @Override
    public void setFather(Person father) {
        this.father = father;
        father.addChild(this);
    }

    @Override
    public List<Person> getChildren() {
        return children;
    }

    @Override
    public void addChild(Person child) {
        children.add(child);
    }

    @Override
    public String toString() {
        return "Генеалогическое дерево(" +
                "Имя -> " + name + '\'' +
                ", Год рорждения -> " + birthYear +
                ", Отец -> " + father +
                ", Мать -> " + mother +
                ')';
    }
}
