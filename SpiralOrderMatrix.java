package com.company;

public class Solution {

    public int[][] generateMatrix(int A) {

        int i, rowfirst = 0, colfirst = 0, rowend = A, colend = A;

        int n = 1;
        int [][] square_mas = new int [A][A];


        while (rowfirst < rowend && colfirst < colend) {

            for (i=colfirst; i < colend; i++) {
                square_mas [rowfirst][i] = n;
                n++;
            }
            rowfirst++;


            for (i=rowfirst; i < rowend; i++) {
                square_mas [i][colend-1] = n;
                n++;
            }
            colend--;

            if (rowfirst < rowend) {

                for (i = colend-1; i>=colfirst; i--) {
                    square_mas [rowend-1][i] = n;
                    n++;
                }
                rowend --;
            }

            if (colfirst < colend) {

                for (i = rowend-1; i>=rowfirst; i--) {
                    square_mas [i][colfirst] = n;
                    n++;
                }
                colfirst ++;
            }
        }


        return square_mas;
    }
}
