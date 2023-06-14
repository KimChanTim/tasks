import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            Car car1 = new Car("Niva", 60);
            System.out.println(car1);

            serialize(car1);
            Car car2 = (Car) deserialize();

            System.out.println(car2.toString());

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void serialize(Object car) throws IOException {
        ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream("task3/car.ser"));
        stream.writeObject(car);
        stream.flush();
        stream.close();
    }

    private static Object deserialize() throws IOException, ClassNotFoundException {
        ObjectInputStream stream = new ObjectInputStream(new FileInputStream("task3/car.ser"));
        Object car = stream.readObject();
        stream.close();
        return car;
    }
}