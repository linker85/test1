package com.example.com.testing;

/**
 * Created by raul on 09/11/2016.
 */
public class CalculatorHelper {
    public int sumItems(int i, int i1) {
        return (i + i1);
    }

    public static void main (String args[]) {
        System.out.println(new CalculatorHelper().multiplyItems(-4339, -2131));
        //System.out.println(new CalculatorHelper().powerItems(3, 7));
    }

    public int multiplyItems(int i, int i1) {
        if (i == 0 || i == 1 || i1 == 0 || i1 == 1 ) {
            if (i == 0 || i1 == 0) {
                return 0;
            }
            if (i == 1) {
                return i1;
            } else {
                return i;
            }
        } else {
            int total = 0;
            for (int j = 1; j <= i; j++) {
                total += i1;
            }
            if (i < 0 || i1 < 0) {
                return  -total;
            } else {
                return total;
            }
        }



        /*
        * 3 x 2 =
        * 2 + 2 + 2
        * 5 x 2 =
        * 5 + 5
        *
        * */
    }


    /*
    * 1   2   3   4   5   6   7
    * 3 * 3 * 3 * 3 * 3 * 3 * 3 =
    * */
    public int powerItems(int i, int i1) {
        int result = 1;
        for (int j = 1; j <= i1; j++) {
            result = multiplyItems(result, i);//result * i;
        }
        return result;
    }
}