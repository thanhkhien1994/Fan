public class Fan {
    private final int SLOWS = 1;
    private final int MEDIUM = 2;
    private final int FAST = 3;

    private int speed = SLOWS;
    private boolean isOn = false;
    private double radius = 5;
    private String color = "blue";

    public Fan() {
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSLOWS() {
        return SLOWS;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    @Override
    public String toString() {
        return "Fan{" +
                "speed=" + speed +
                ", isOn=" + isOn +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
