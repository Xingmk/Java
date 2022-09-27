package org.example;

import java.security.InvalidParameterException;

/**
 * 矩阵类
 */
public class Matrix {
    public int rows;  // 矩阵的行数
    public int cols;  // 矩阵的列数

    public double[][] data;  // 矩阵的数据

    /**
     * 构造方法
     * @param data
     */
    public Matrix(double[][] data) {
        this.data = data;
        rows = data.length;
        cols = data[0].length;
    }

    /**
     * 矩阵加法
     * @param m
     */
    public void add(Matrix m) {
        if (this.rows != m.rows || this.cols != m.cols) {
            throw new InvalidParameterException();
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                data[i][j] += m.data[i][j];
            }
        }
    }

    /**
     * 矩阵转置
     * @return
     */
    public Matrix transpose() {
        Matrix t = new Matrix(new double[cols][rows]);

        /*******************************************
         * 实验：实现矩阵的转置，结果用矩阵t返回。
         ******************************************/

        return t;
    }

    /**
     * 矩阵相乘
     * @param m
     * @return
     */
    public Matrix multiply(Matrix m) {
        if (this.rows != m.cols || this.cols != m.rows) {
            throw new InvalidParameterException();
        }

        Matrix r = new Matrix(new double[rows][m.cols]);

        /*******************************************
         * 实验：实现矩阵的乘法，结果用矩阵r返回。
         ******************************************/

        return r;
    }

    /**
     * 显示矩阵的元素
     * @param name
     */
    public void show(String name) {
        System.out.println(name);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
