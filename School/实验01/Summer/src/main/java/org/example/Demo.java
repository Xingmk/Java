package org.example;

public class Demo {
    public static void main(String[] args) {
        int sum = 0;

        // 实验：使用for循环计算1+2+3+4+…+100
        for (int i = 1; i < 101; i++){
                sum += i;
                System.out.print("result " + sum);
                System.out.print("\n");
        }

        System.out.println("sum = " + sum);

        // 实验：使用while循环计算1+3+5+…+99
        sum = 0;

        while (x<21){
            int x = 1;
            sum += x;
            System.out.print("result " + sum);
            x++;
        }

        System.out.println("sum = " + sum);
    }
}
