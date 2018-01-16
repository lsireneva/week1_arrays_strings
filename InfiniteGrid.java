package com.company;

public class InfiniteGrid {


    public int coverPoints(int[] A, int[] B) {
        int numSteps = 0;
        int startX=A[0], startY=B[0];

        for (int i=0; i < A.length; i++) {
            int x= Math.abs (startX - A[i]);
            int y = Math.abs (startY- B[i]);
            startX=A[i];
            startY=B[i];
            numSteps+= Math.max(x, y);
        }
        return numSteps;
    }
}
