package com.company;

public class Human implements Run, Jump {
    public String name;
    public int maxHeight, maxDistance;
    public int humanFlag = 0;

    public Human(String name,int maxHeight, int maxDistance) {
        this.name = name;
        this.maxDistance = maxDistance;
        this.maxHeight = maxHeight;
    }
    public void run(int distance) {
        if (distance <= maxDistance) {
            System.out.println("Human " + name + " ran " + distance + " meters");
        } else {
            System.out.println("Human " + name + " couldn't run " + distance + " meters. Human will not proceed further.");
        humanFlag = 1;
        }
    }

    public void jump(int distance) {
        if (distance <= maxHeight) {
            System.out.println("Human " + name + " jumped " + distance + " meters");
        } else {
            System.out.println("Human " + name + " couldn't jump " + distance + " meters. Human will not proceed further.");
        humanFlag = 1;
        }
    }
}
