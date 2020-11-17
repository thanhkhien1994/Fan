public class TestFan {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(fan1.getFAST());
        fan1.setColor("Yellow");
        fan1.setOn(true);
        Fan fan2 = new Fan();
        fan2.setSpeed(fan1.getMEDIUM());
        fan2.setRadius(5);
        fan2.setColor("Blue");
        fan2.setOn(false);

        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
