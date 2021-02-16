package com.company;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat("Gigi", 2, 50);
        Robot robot = new Robot("iRobot", 5, 2500);
        Human human = new Human("Johny", 1, 1500);
        Wall wall0 = new Wall(1);
        Wall wall1 = new Wall(2);
        Treadmill treadmill0 = new Treadmill(100);
        Treadmill treadmill1 = new Treadmill(5000);

        Object [] participants = {cat, robot, human};
        Object [] obstacles = {wall0, treadmill0, wall1, treadmill1};

        for (int i = 0; i < participants.length; i++) {
            if (participants[i] instanceof Cat) {
                for (int j = 0; j < obstacles.length; j++) {
                    if (obstacles[j] instanceof Wall) {
                        cat.jump(((Wall)obstacles[j]).getHeight());
                        if (cat.catFlag == 1) {
                            break;
                        }
                    } else {cat.run(((Treadmill)obstacles[j]).getLength());
                        if (cat.catFlag == 1) {
                            break;
                        }}
                }
            } else if (participants[i] instanceof Robot) {
                for (int j = 0; j < obstacles.length; j++) {
                    if (obstacles[j] instanceof Wall) {
                        robot.jump(((Wall)obstacles[j]).getHeight());
                        if (robot.robotFlag == 1) {
                            break;
                        }
                    } else {robot.run(((Treadmill)obstacles[j]).getLength());
                        if (robot.robotFlag == 1) {
                            break;
                        }}
                }
            } else {
                for (int j = 0; j < obstacles.length; j++) {
                    if (obstacles[j] instanceof Wall) {
                        human.jump(((Wall)obstacles[j]).getHeight());
                        if (human.humanFlag == 1) {
                            break;
                        }
                    } else {human.run(((Treadmill)obstacles[j]).getLength());
                        if (human.humanFlag == 1) {
                            break;
                        }
                    }
                }
            }
            System.out.println();
        }
    }
}
