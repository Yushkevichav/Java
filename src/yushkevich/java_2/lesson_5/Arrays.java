/**
 * Java 2. Lesson 5
 *
 * @author Andrey Yushkevich
 * version dated March 14, 2019
 */

package yushkevich.java_2.lesson_5;

public class Arrays {
    private final int SIZE = 10000000;
    private final int HALF = SIZE / 2;
    private float[] arr1 = new float[SIZE];
    private float[] arr2 = new float[HALF];
    private float[] arr3 = new float[HALF];


    public float[] calculate(float[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        return arr;
    }


    public void oneThread() {
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = 1.0f;
        }
        long a = System.currentTimeMillis();
        calculate(arr1);
        System.out.println("One thread ends with: " + (System.currentTimeMillis() - a));
    }


    public void twoThreads() {
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = 1.0f;
        }
        long a = System.currentTimeMillis();
        System.arraycopy(arr1, 0, arr2, 0, HALF);
        System.arraycopy(arr1, HALF, arr3, 0, HALF);

        Thread thread1 = new Thread() {
            public void run() {
                float[] a1 = calculate(arr2);
                System.arraycopy(a1, 0, arr2, 0, a1.length);
            }
        };


        Thread thread2 = new Thread() {
            public void run() {
                float[] a2 = calculate(arr3);
                System.arraycopy(a2, 0, arr3, 0, a2.length);
            }
        };

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.arraycopy(arr2, 0, arr1, 0, HALF);
        System.arraycopy(arr3, 0, arr1, HALF, HALF);
        System.out.println("Two threads ends with: " + (System.currentTimeMillis() - a));
    }
}