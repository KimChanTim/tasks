public class Tentacle implements Hand, Leg{
    private String tentacleName;
    private Object object = null;

    public Tentacle(String handName) {
        this.tentacleName = handName;
    }
    @Override
    public void take(Object object) {
        if (this.object == null) {
            this.object = object;
            System.out.println(tentacleName + " take the object.");
        } else {
            System.out.println(tentacleName + " is already holding the object.");
        }
    }

    @Override
    public void put(Hand hand) {
        if (hand != null) {
            hand.take(object);
            object = null;
            System.out.println(tentacleName + " puts the object in the other hand.");
        } else {
            throwObj();
        }
    }

    @Override
    public void put(Body body) {
        if (body != null) {
            body.store(object);
            object = null;
            System.out.println(tentacleName + " puts the object in the other hand.");
        } else {
            throwObj();
        }
    }

    @Override
    public void throwObj() {
        object = null;
        System.out.println(tentacleName + " throw the object.");
    }

    @Override
    public void jump() {
        System.out.println("The robot jumps on the leg with the name " + tentacleName + ".");
    }
}
