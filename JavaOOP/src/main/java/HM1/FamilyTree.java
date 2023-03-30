package HM1;

import java.util.ArrayList;
import java.util.List;

public class FamilyTree {
    private String name;
    private int birthYear;
    private FamilyTree father;
    private FamilyTree mother;
    private ArrayList<FamilyTree> children;

    public FamilyTree(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
        this.children = new ArrayList<FamilyTree>();
    }
    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public FamilyTree getFather() {
        return father;
    }

    public void setFather(FamilyTree father) {
        this.father = father;
        father.addChild(this);
    }

    public FamilyTree getMother() {
        return mother;
    }

    public void setMother(FamilyTree mother) {
        this.mother = mother;
        mother.addChild(this);
    }

    public ArrayList<FamilyTree> getChildren() {
        return children;
    }

    public void addChild(FamilyTree child) {
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

