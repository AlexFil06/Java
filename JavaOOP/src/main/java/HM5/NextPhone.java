package HM5;

public class NextPhone extends Phone{
    public NextPhone(String modelName, Object id, Number ram, int core, int bc) {
        super(modelName, id, ram, core, bc);
    }


    @Override
    public String toString() {
        return
                "Фирма - " + modelName  +
                ", ID - " + id +
                ", RAM - " + ram +
                ", CORE - " + core +
                ", Батарея - " + bc;
    }
}
