import java.util.Scanner;

public class Replace_All {
    public static String replace(String str)
    {
         String str1=str.replaceAll("d","f");
         str1=str1.replaceAll("l","t");
        return str1;
    }
    public static void main(String [] args)
    {
        System.out.println("Enetr the string");
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        String str1=replace(str);
        System.out.println(str1);


    }
}
