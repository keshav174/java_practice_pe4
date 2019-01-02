package com.stackroute.unittest.pe4;

import java.util.Scanner;

public class Charoccurance {
    public static int countoccur(String str,char c,int i)
    {
        int count=0;
        if(i==str.length())
            return count;
        if(str.charAt(i)==c)
            count=1+countoccur(str,c,++i);
        else
            count=countoccur(str,c,++i);

        return count;
    }
    public static  void main(String [] args)
    {
        System.out.println("Enter the String ");
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        String str1=in.nextLine();
        int count= countoccur(str,str1.charAt(0),0);
        System.out.println(count);
    }
}
