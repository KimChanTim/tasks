public class HumanLeg implements Leg {
    private final String legName;
    @Override
    public void jump() {
        System.out.println("The robot jumps on the leg with the name " + legName + ".");
    }

    public HumanLeg(String legName) {
        this.legName = legName;
    }
}
