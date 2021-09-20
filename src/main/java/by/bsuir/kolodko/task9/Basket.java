package by.bsuir.kolodko.task9;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Basket {

    private final List<Ball> balls = new LinkedList<>();

    public void addBall(Ball ball) {
        balls.add(ball);
    }

    public void addAllBalls(Ball ... b) {
        balls.addAll(Arrays.asList(b));
    }

    public int getTotalWeight() {
        int weight = 0;
        for (Ball ball : balls) {
            weight += ball.getWeight();
        }
        return weight;
    }

    public int getByColor(Color color) {
        return (int) balls.stream()
                .filter(ball -> ball.getColor() == color)
                .count();
    }

}
