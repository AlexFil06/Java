package HM2;

import java.util.ArrayList;
import java.util.List;

public class NewPerson<T> implements Person {

    public String name;
    public T birthYear;
    public Person father;
    public Person mother;
    public ArrayList<Person> children;

    /** Конструктор для создания персоны и добавление списка  детей персоны */
    public NewPerson(String name, T birthYear) {
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
    public void setBirthYear(Object i_birthYear) {
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


}
