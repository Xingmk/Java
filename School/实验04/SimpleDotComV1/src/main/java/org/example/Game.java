package org.example;

import java.util.Scanner;

/**
 * 游戏主类
 */
public class Game {
    public static void main(String[] args) {
        DotCom dotCom = new DotCom();
        boolean isAlive = true;

        while (isAlive) {
            System.out.print("Please enter a number: ");
            Scanner scanner = new Scanner(System.in);
            int guess = scanner.nextInt();

            EGameResult result = dotCom.checkUserGuess(guess);

            /*****************************************
             * 实验：根据比较的结果进行输出
             *****************************************/
            switch (result) {
            }
        }
    }
}
