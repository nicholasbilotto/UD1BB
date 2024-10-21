public class PaddleTester {
    public static void main(String[] args) {
        Paddle paddle = new Paddle(100, 200, 60, 10, 5);
        
        System.out.println("Initial state: " + paddle);
        
        paddle.moveLeft();
        System.out.println("After moving left: " + paddle);
        
        paddle.moveRight();
        System.out.println("After moving right: " + paddle);
    }
}