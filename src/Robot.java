public class Robot {
    private int x = 0;
    private int y = 0;
    private static String direction = String.valueOf(Direction.UP);

    Robot(int x, int y, String direction) {
        this.x = x;
        this.y = y;
        this.direction= direction;
    }


    public Direction getDirection() {
        Direction direction1 = Direction.valueOf(direction);

        switch (direction1) {
            case UP:
                direction1 = Direction.UP;
                break;
            case DOWN:
                direction1 = Direction.DOWN;
                break;
            case RIGHT:
                direction1 = Direction.RIGHT;
                break;
            case LEFT:
                direction1 = Direction.LEFT;
                break;
        }

        return direction1;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    Direction direction1 = getDirection();

    public void turnLeft() {
        switch (direction1) {
            case UP:
                direction1 = Direction.LEFT;
                break;
            case DOWN:
                direction1 = Direction.RIGHT;
                break;
            case RIGHT:
                direction1 = Direction.UP;
                break;
            case LEFT:
                direction1 = Direction.DOWN;
                break;
        }
    }

    public void turnRight() {
        switch (direction1) {
            case UP:
                direction1 = Direction.RIGHT;
                break;
            case DOWN:
                direction1 = Direction.LEFT;
                break;
            case RIGHT:
                direction1 = Direction.DOWN;
                break;
            case LEFT:
                direction1 = Direction.UP;
                break;
        }
    }

    public void stepForward() {
        switch (direction1) {
            case UP:
                y++;
                break;
            case DOWN:
                y--;
                break;
            case RIGHT:
                x++;
                break;
            case LEFT:
                x--;
                break;
        }
    }

    public static void moveRobot(Robot robot, int toY, int toX) {
        int tX = robot.getX();
        int tY = robot.getY();

        if (tX >= toX) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
            while (tX != toX){
                robot.stepForward();
                System.out.println(robot.getX() + " " + robot.getY() + ". Направление взгляда: " + robot.getDirection());
                tX--;
            }
        } else {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
            while (tX != toX) {
                robot.stepForward();
                System.out.println(robot.getX() + " " + robot.getY() + ". Направление взгляда: " + robot.getDirection());
                tX++;
            }
        }

        if (tY >= toY) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnLeft();
            }
            while (tY != toY) {
                robot.stepForward();
                System.out.println(robot.getX() + " " + robot.getY() + ". Направление взгляда: " + robot.getDirection());
                tY--;
            }

        } else {
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
            while (tY != toY) {
                robot.stepForward();
                System.out.println(robot.getX() + " " + robot.getY() + ". Направление взгляда: " + robot.getDirection());
                tY++;
            }
        }
    }

    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }
}
