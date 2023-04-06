package HM2;

public class FamTree<T> extends NewPerson {
    /** Конструктор для создания персоны и добавление списка детей если они имеются */
    public FamTree(String name, T birthYear) {

        super(name, birthYear);
    }
    /** Метод получения года рождения */
   public T getBirthYear(){
        return (T) birthYear;
   }


//
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
