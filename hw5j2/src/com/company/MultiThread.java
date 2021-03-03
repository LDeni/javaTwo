package com.company;

public class MultiThread extends Thread {

    public float [] arr;
    public int firstIndex;

    public MultiThread(float [] arr, int firstIndex) {
        this.arr = arr;
        this.firstIndex = firstIndex;
    }

    public void run() {
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + (i + firstIndex) / 5) * Math.cos(0.2f + (i + firstIndex) / 5) * Math.cos(0.4f + (i + firstIndex) / 2));
        }
    }
}
