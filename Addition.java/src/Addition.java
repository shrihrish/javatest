package com.stackroute.unittest;

import java.util.Scanner;

public class Addition {
    public int AdditionTest(String in) {
        int sum = 0;

        String s[] = in.split(" ");

        int out[] = new int[s.length];

        for (int i = 0; i < s.length; i++) {
            out[i] = Integer.parseInt(s[i]);

        }
        for (int i = 0; i < out.length; i++) {
            sum += out[i];
        }
        return sum;


    }
}



