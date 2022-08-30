package org.example;

public class Demo {
    public static void main(String[] args) {
        int num = 20;
        int[] fib = Fibonacci.compute(num);

        if (fib == null) {
            System.out.println("num = " + num);
        } else {
            for (int i = 0; i < fib.length; i++) {
                System.out.println("" + fib[i]);
            }
        }
    }
}
