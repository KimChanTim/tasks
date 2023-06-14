import java.io.Serializable;

public class Car implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private Integer speed;

    public Car(String name, Integer speed) {
        this.name = name;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car{" + "name='" + name + '\'' + ", speed=" + speed + '}';
    }
}
