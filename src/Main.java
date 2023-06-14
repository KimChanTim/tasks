public class Main {
    public static void main(String[] args) {

        Robot robot = new Robot(new HumanHead("Simple head"), new HumanBody("Simple body"),
                new HumanHand("Simple human hand"), new Tentacle("Simple tentacle"),
                new HumanLeg("Simple human leg"));

        robot.hand1.take("Car");
        robot.hand1.put(robot.hand2);
        robot.hand2.put(robot.body);
        robot.body.printObjectInformation();
        robot.hand1.take("Dog");
        robot.hand1.put(robot.body);
        robot.body.printObjectInformation();
        robot.leg.jump();
    }
}