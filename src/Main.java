import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        String direction = scanner.next();

        int toX = scanner.nextInt();
        int toY = scanner.nextInt();

        scanner.close();



        Robot robot = new Robot(x, y, direction);

        Robot.moveRobot(robot, toY, toX);
    }

}







