package baitap4.Fan;

public class Fan {
    private int speed;
    private boolean on;
    private double radius;
    private String color;
    private static int fanCount = 1;

    private int fanNumber;

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
        fanNumber = fanCount++;

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

    public Fan() {
    }

    ;

    public void displayFan() {
        String speedText = null;
        switch (speed) {
            case 1:
                speedText = "slow";
                break;
            case 2:
                speedText = "medium";
                break;
            case 3:
                speedText = "fast";
                break;
            default:
                break;
        }
        if (on) {
            System.out.println("Thông tin của Quạt " + fanNumber);
            System.out.println("Tốc độ của quạt là : " + speedText);
            System.out.println("Màu của quạt là : " + color);
            System.out.println("Bán kính của quạt là : " + radius);
            System.out.println("Fan is on");
        } else {
            System.out.println("Thông tin của Quạt " + fanNumber);
            System.out.println("Màu của quạt là : " + color);
            System.out.println("Bán kính của quạt là : " + radius);
            System.out.println("Fan is off");
        }
    }
}
