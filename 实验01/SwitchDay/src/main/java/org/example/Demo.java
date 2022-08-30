package org.example;

public class Demo {
    private static void print(int day) {
        // 实验：使用switch case语句，根据变量day的值，
        // 如果day = 1，输出“Monday”，如果day = 2，输出”Tuesday”；
        // 如果day = 3，输出”Wednesday”；如果day = 4，输出”Thursday”；
        // 如果day = 5，输出”Friday”；如果day =6,输出”Saturday”；
        // 如果day = 7，输出”Sunday”。

    }

    public static void main(String[] args) {
        int day = 2;
        print(day);

        day = 5;
        print(day);

        day = 1;
        print(day);
    }
}
