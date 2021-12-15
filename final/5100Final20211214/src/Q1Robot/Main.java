package Q1Robot;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[][] room = {{1, 0, 1, 0},{-1, 1, 0, 1},{0, 1, 0, -1}};
        Roomba roomba = new Roomba(room);
        // execute 100 times
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            roomba.clean(); // try to clean the spot.
            if (!roomba.move()) {
                // if roomba can't move, make a random decision whether to turn left or right.
                if (random.nextBoolean()) {
                    roomba.turnLeft();
                } else {
                    roomba.turnRight();
                }
            }
        }
    }



}
