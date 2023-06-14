import java.util.Objects;
import java.util.Stack;

public class HumanBody implements Body {
    private String bodyName;
    private Stack<Object> objects = null;
    @Override
    public void printObjectInformation() {
        for (Object obj : objects) {
            System.out.println(obj.toString());
        }
    }

    @Override
    public void store(Object object) {
        objects.push(object);
    }

    public HumanBody(String bodyName) {
        objects = new Stack<>();
        this.bodyName = bodyName;
    }
}
