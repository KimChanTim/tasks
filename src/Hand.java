public interface Hand {
    public void take(Object object);
    public void put(Hand hand);
    public void put(Body body);
    public void throwObj();
}
