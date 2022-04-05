package _04_object_and_class.exercise.fan;

public class Fan {
    static final int SLOW = 1, MEDIUM = 2, FAST = 3;

    private int speed;

    private boolean on;

    private double radius;

    private String color;

    public Fan() {
        this(1, false, 5, "blue");
    }

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

    public boolean isOff() {
        return on ;
    }

    public void setOff(boolean off) {
        this.on  = off;
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

    public boolean status(){
        return this.on;
    }

    @Override
    public String toString() {
        if (status()){
            return "Speed = " + getSpeed() + " ;Radius = " + getRadius() + " ;Color = " + getColor() + " ;Fan is on";
        }else {
            return "Color = " + this.color + " ;Radius = " + this.radius + " ;Fan is off";
        }
    }
}
