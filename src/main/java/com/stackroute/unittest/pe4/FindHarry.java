package com.stackroute.unittest.pe4;

public class FindHarry {

        public boolean presenceOfString(String input) {

            boolean res = input.matches("(.*)Harry(.*)");
            System.out.println(res);
            return res;
        }
    }

