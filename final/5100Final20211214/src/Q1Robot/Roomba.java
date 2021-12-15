package Q1Robot;

import java.util.Random;

public final class Roomba implements iRobot {
    private int[][] room;
    private int rows;
    private int cols;
    private Direction direction;
    private int x;
    private int y;

    public Roomba(int[][] rooms) {
        this.room = rooms;
        this.rows = rooms.length;
        this.cols = rooms[0].length;
        this.direction = Direction.DOWN;
        this.x = 0;
        this.y = 0;
    }

    @Override
    public boolean move() {
        if (direction == Direction.UP) {
            if (x > 0 && room[x - 1][y] != -1) {
                x--;
                System.out.println("move");
                return true;
            } else {
                System.out.println("stay");
                return false;
            }
        } else if (direction == Direction.LEFT){
            if (y > 0 && room[x][y - 1] != -1) {
                y--;
                System.out.println("move");
                return true;
            } else {
                System.out.println("stay");
                return false;
            }
        } else if (direction == Direction.DOWN){
            if (x < rows - 1 && room[x + 1][y] != -1) {
                x++;
                System.out.println("move");
                return true;
            } else {
                System.out.println("stay");
                return false;
            }
        } else {
            if (y < cols - 1 && room[x][y + 1] != -1) {
                y++;
                System.out.println("move");
                return true;
            } else {
                System.out.println("stay");
                return false;
            }
        }
    }

    @Override
    public void turnLeft() {
        if (this.direction == Direction.UP) {
            this.direction = Direction.LEFT;
        } else if (this.direction == Direction.LEFT){
            this.direction = Direction.DOWN;
        } else if (this.direction == Direction.DOWN){
            this.direction = Direction.RIGHT;
        } else{
            this.direction = Direction.UP;
        }
        System.out.println("turnLeft");
    }

    @Override
    public void turnRight() {
        if (this.direction == Direction.UP) {
            this.direction = Direction.RIGHT;
        } else if (this.direction == Direction.RIGHT){
            this.direction = Direction.DOWN;
        } else if (this.direction == Direction.DOWN){
            this.direction = Direction.LEFT;
        } else{
            this.direction = Direction.UP;
        }
        System.out.println("turnRight");
    }

    @Override
    public void clean() {
        if (this.room[x][y] == 0) {
            // if spot is not clean, clean it.
            System.out.println("clean");
            this.room[x][y] = 1;
        }
    }

}