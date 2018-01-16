package com.company;

public String reverseWords(String a) {

        Stack <String> words = new Stack<String>();

        boolean look_for_word=true;
        int start_pos=0, end_pos=0;

        for (int i = 0; i < a.length(); i++) {
        //System.out.println("char="+i+"="+input.charAt(i));

        if (look_for_word && a.charAt(i) != ' ') {
        start_pos=i;
        look_for_word=false;
        }
        if (!look_for_word && (a.charAt(i) == ' ' || i == a.length()-1) ) {
        end_pos=i;
        look_for_word= true;
        if (i == a.length()-1) {end_pos++;}
        words.push(a.substring(start_pos, end_pos));
        //System.out.println("Pushed word = '"+ input.substring(start_pos, end_pos) + "'");
        }

        }

        //2 pop from stack and add spaces
        String res_str="";
        while (!words.empty()) {
        res_str+= words.pop();
        if (!words.empty()) {
        res_str+=" ";
        }
        }
        return res_str;
}
