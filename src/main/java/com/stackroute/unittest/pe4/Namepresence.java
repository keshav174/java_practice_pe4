package com.stackroute.unittest.pe4;

import java.util.regex.Pattern;

public class Namepresence {
    public static String findpresence(String str1,String str2)
    {
        if(Pattern.matches("[*str2*]",
                str1))
        return "yes";

        else
        return "No";

    }
    public static  void main(String [] args)
    {
        String str1="My name is Harry";
        String str2="Harry";
        String str=findpresence(str1,str2);
        System.out.println(str);
    }
}
