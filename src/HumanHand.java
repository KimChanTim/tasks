public class HumanHand implements Hand {
    private String handName;
    private Object object = null;

    public HumanHand(String handName) {
        this.handName = handName;
    }
    @Override
    public void take(Object object) {
        if (this.object == null) {
            this.object = object;
            System.out.println(handName + " take the object.");
        } else {
            System.out.println(handName + " is already holding the object.");
        }
    }

    @Override
    public void put(Hand hand) {
        if (hand != null) {
            hand.take(object);
            object = null;
            System.out.println(handName + " puts the object in the other hand.");
        } else {
            throwObj();
        }
    }

    @Override
    public void put(Body body) {
        if (body != null) {
            body.store(object);
            object = null;
            System.out.println(handName + " puts the object in the other hand.");
        } else {
            throwObj();
        }
    }

    @Override
    public void throwObj() {
        object = null;
        System.out.println(handName + " throw the object.");
    }
}
