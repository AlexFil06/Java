package HM2;


import java.util.List;

public interface Person {
    String getName();

    void setName(String name);

    void setBirthYear(int birthYear);

    Person getMother();

    void setMother(Person mother);

    Person getFather();

    void setFather(Person father);

    List<Person> getChildren();

    void addChild(Person child);

}
