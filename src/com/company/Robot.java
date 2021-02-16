package com.company;

public class Robot implements Run, Jump {
    public String name;
    public int maxHeight, maxDistance;
    public int robotFlag = 0;

    public Robot(String name, int maxHeight, int maxDistance) {
        this.name = name;
        this.maxDistance = maxDistance;
        this.maxHeight = maxHeight;
    }
    public void run(int distance) {
        if (distance <= maxDistance) {
            System.out.println("Robot " + name + " ran " + distance + " meters");
        } else {
            System.out.println("Robot " + name + " couldn't run " + distance + " meters. Now the battery is low and Robot is unable to operate further.");
       robotFlag = 1;
        }
    }

    public void jump(int distance) {
        if (distance <= maxHeight) {
            System.out.println("Robot " + name + " jumped " + distance + " meters");
        } else {
            System.out.println("Robot " + name + " couldn't jump " + distance + " meters. Now the battery is low and Robot is unable to operate further.");
       robotFlag = 1;
        }
    }
}
