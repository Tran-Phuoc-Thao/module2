package lopvadoituongjava;

public class Fan {
    final static int SLOW = 1, MEDIUM = 2, FAST = 3;
    int speed = SLOW;
    boolean on = false;
    String color = "blue";
    double radius = 5;

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String toString() {
        String state = "";
        if (this.isOn()) {
            state += ("Fan is on\n");
            state += ("Speed: " + this.speed + "\n");
        } else {
            state += ("Fan is off");
        }
        state += ("Color: " + this.color + "\n");
        state += ("Radius: " + this.radius + "\n");
        return state;
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan(MEDIUM,true,10,"yellow");
        System.out.println(fan1.toString());
        Fan fan2 = new Fan(SLOW,false,5,"Blue");
        System.out.println(fan2.toString());
    }
}
