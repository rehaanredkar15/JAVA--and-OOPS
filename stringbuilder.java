package com.company;


public class stringbuilder {

    public static void main(String[] args) {
	// write your code here
        String str = "";
          str += "hello ";
          str += "I am rehan.";
          str += " nice to meet you";
        System.out.println(str);
         /*  string is not mutable so what happening here is, every time a new string is created so to avoid this we
         are using string builder which can make changes in the same string and no need of creating string again   */
       StringBuilder sb = new StringBuilder();
       sb.append("rehan");
       sb.append(" thanks for talking with us");
       /* here the changes are done in a same string and the space and time is saved so this is the most efficient way */
    }
}
