package com.company;

public class Cat implements Run, Jump {

    public String name;
    public int maxHeight, maxDistance;
    public int catFlag = 0;

    public Cat(String name, int maxHeight, int maxDistance) {
        this.name = name;
        this.maxDistance = maxDistance;
        this.maxHeight = maxHeight;

    }
    public void run(int distance) {
        if (distance <= maxDistance) {
            System.out.println("Cat " + name + " ran " + distance + " meters");
        } else {
            System.out.println("Cat " + name + " couldn't run " + distance + " meters. Cat is tired and doesn't want to do anything anymore!");
        catFlag = 1;
        }
    }

    public void jump(int distance) {
        if (distance <= maxHeight) {
            System.out.println("Cat " + name + " jumped " + distance + " meters");
        } else {
            System.out.println("Cat " + name + " couldn't jump " + distance + " meters. Cat is pissed off and doesn't want to do anything anymore!");
        catFlag = 1;
        }
    }
}
