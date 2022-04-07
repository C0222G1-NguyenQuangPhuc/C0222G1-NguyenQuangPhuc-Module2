package _06_inheritance.exercise.point_and_moveable_point;

public class MoveablePoint extends Point{
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MoveablePoint() {
    }

    public MoveablePoint(float xFloat) {
        this.xSpeed = xFloat;
    }

    public MoveablePoint(float xFloat, float yFloat) {
        this.xSpeed = xFloat;
        this.ySpeed = yFloat;
    }

    public MoveablePoint(float x, float y, float xFloat, float yFloat) {
        super(x, y);
        this.xSpeed = xFloat;
        this.ySpeed = yFloat;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xFloat) {
        this.xSpeed = xFloat;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed(){
        return new float[]{getxSpeed(),getySpeed()};
    }

    @Override
    public String toString() {
        return "MoveablePoint{"+ "x="+ super.getX() + ", y=" + super.getY() +
                ", xSpeed=" + getxSpeed() +
                ", ySpeed=" + getySpeed() +
                '}';
    }

    public MoveablePoint move(){
        super.setX(getX() + getxSpeed());
        super.setY(getY() + getySpeed());
        return this;
    }
}
