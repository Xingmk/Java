package org.example;

public class Demo {
    public static void main(String[] args) {
        Matrix m1 = new Matrix(new double[][]{
                {1,0,0},
                {0,1,0}}
        );

        Matrix m2 = new Matrix(new double[][]{
                {1,2,1},
                {0,1,0}}
        );

        m1.show("m1");
        m2.show("m2");
        m1.add(m2);
        m1.show("m1");

        Matrix t = m2.transpose();
        t.show("t");

        Matrix r = m2.multiply(t);
        r.show("r");
    }
}
