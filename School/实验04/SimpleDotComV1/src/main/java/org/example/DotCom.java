package org.example;

import java.util.Random;

/**
 * DotCom类
 */
public class DotCom {
    private int[] locations;  // 位置坐标
    private int numOfHits;    // 猜中次数

    /**
     * 构造方法
     */
    public DotCom() {
        Random rnd = new Random();
        int seed = rnd.nextInt(5);
        locations = new int[]{seed, seed+1, seed+2};
    }

    /**
     * 对用户输入进行比对
     * @param guess 用户输入的整数坐标
     * @return 猜测的结果
     */
    public EGameResult checkUserGuess(int guess) {
        EGameResult result = EGameResult.MISS;

        /*****************************************
         * 实验：对用户输入的数据进行检查
         *****************************************/


        return  result;
    }
}
