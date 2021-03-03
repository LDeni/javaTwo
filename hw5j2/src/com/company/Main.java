package com.company;

public class Main {
    static final int SIZE = 10000000;
    static final int HALF = SIZE / 2;
    static float[] arr = new float[SIZE];

    public static void main(String[] args) throws InterruptedException {
        method1();
        method2();
    }

        public static  void method1() {
            float[] arr = new float[SIZE];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = 1;
            }
            long a = System.currentTimeMillis();
            for (int i = 0; i < arr.length; i++) {
                arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
            System.out.println(System.currentTimeMillis() - a);
            System.out.println(sum(arr));
        }

        public static  void method2() throws InterruptedException {
            float[] arr = new float[SIZE];
            float[] a1 = new float[HALF];
            float[] a2 = new float[HALF];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = 1;
            }
            MultiThread myThread1 = new MultiThread(a1, 0);
            MultiThread myThread2 = new MultiThread(a2, HALF);

            long a = System.currentTimeMillis();

            System.arraycopy(arr, 0, a1, 0, HALF);
            System.arraycopy(arr, HALF, a2, 0, HALF);
            myThread1.start();
            myThread2.start();

            myThread1.join();
            myThread2.join();

            System.arraycopy(a1, 0, arr, 0, HALF);
            System.arraycopy(a2, 0, arr, HALF, HALF);

            System.out.println(System.currentTimeMillis() - a);
            System.out.println(sum(arr));

        }

        public static float sum(float[] arr) {
        float sum = 0;
            for (int i = 0; i < arr.length ; i++) {
                sum += arr[i];
            }
            return sum;
        }

}
