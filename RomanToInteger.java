public class Solution {
    public int romanToInt(String A) {
        int sumInInteger = 0;
        int [] numbers = new int[A.length()];

        for (int i=0; i<A.length(); i++) {

            switch (A.charAt(i)) {
                case 'I':
                    numbers[i] = 1;
                    break;
                case 'V':
                    numbers[i] = 5;
                    break;
                case 'X':
                    numbers[i] = 10;
                    break;
                case 'L':
                    numbers[i] = 50;
                    break;
                case 'C':
                    numbers[i] = 100;
                    break;
                case 'D':
                    numbers[i] = 500;
                    break;
                case 'M':
                    numbers[i] = 1000;
                    break;
            }

        }

        for (int j=0; j<numbers.length-1; j++) {
            if (numbers[j] < numbers[j+1]) {
                sumInInteger-=numbers[j];
            } else {
                sumInInteger+=numbers[j];
            }
        }


        return sumInInteger+numbers[numbers.length-1];
    }
}
