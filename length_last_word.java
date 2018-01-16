package com.company;

public class length_last_word {

    public int lengthOfLastWord(final String a) {

        boolean look_for_word=true;
        int start=0, end=0;

        for (int i = 0; i < a.length(); i++) {

            if (look_for_word && a.charAt(i) != ' ') {
                start=i;
                look_for_word=false;
            }
            if (!look_for_word && (i == a.length()-1 || a.charAt(i+1) == ' ')) {
                end=i+1;
                look_for_word= true;

            }
        }

        return end-start;
    }
}
