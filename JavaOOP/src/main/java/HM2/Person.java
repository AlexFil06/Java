package HM2;


import java.util.List;

public interface Person<T> {

    /** Получение имени */
    String getName();
    /** Изменение имени */
    void setName(String i_name);

    /**
     * Добавление года рождения
     * Возможность ввода в строчном и цифровом виде
     * */
    void setBirthYear(T i_birthYear);
    /** Получение имени матери */
    Person getMother();
    /** Добавление матери к персоне */
    void setMother(Person i_mother);
    /** Получение имени отца */
    Person getFather();
    /** Добавление отца к персоне */
    void setFather(Person i_father);
    /** Получение списка детей персоны */
    List<Person> getChildren();
    /** Метод используется в
     * setMother
     * setFather
     * для добавления ребенка в список родителя*/
    void addChild(Person i_child);

}
