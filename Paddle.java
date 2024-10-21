public class Paddle extends GameObject {
    private int speed;
    public Paddle(int x, int y, int width, int height, int speed) {
        super(x, y, width, height);
        this.speed = speed;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void moveLeft() {
        setX(getX() - speed);
    }
    public void moveRight() {
        setX(getX() + speed);
    }
    @Override
    public String toString() {
        return "Paddle [x=" + getX() + ", y=" + getY() + ", speed=" + speed + "]";
    }
}
//test
