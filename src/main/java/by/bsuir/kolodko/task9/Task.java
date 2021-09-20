package by.bsuir.kolodko.task9;

public class Task {

    public static void main(String[] args) {
        Ball ball1 = new Ball(3, Color.BLUE);
        Ball ball2 = new Ball(4, Color.RED);
        Ball ball3 = new Ball(7, Color.BLACK);
        Ball ball4 = new Ball(6, Color.GREEN);
        Ball ball5 = new Ball(5, Color.GREEN);
        Ball ball6 = new Ball(5, Color.BLUE);

        Basket basket = new Basket();
        basket.addAllBalls(ball1, ball2, ball3, ball4, ball5, ball6);

        System.out.println("Total weight: " + basket.getTotalWeight());
        System.out.println("Amount of blue balls: " + basket.getByColor(Color.BLUE));
    }

}
