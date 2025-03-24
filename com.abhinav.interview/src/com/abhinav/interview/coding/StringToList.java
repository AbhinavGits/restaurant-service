package com.abhinav.interview.coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringToList {
    public static void main(String[] args) {
        String str = "Java";
        char[] charArray = str.toCharArray();
        
        List<Character> charList = new ArrayList<>();
        for (char c : charArray) {
            charList.add(c);
        }

        System.out.println(charList); 
      
    }
}