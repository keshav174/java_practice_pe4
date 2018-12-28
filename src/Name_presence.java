import java.util.regex.Pattern;

public class Name_presence {
    public static String find_presence(String str1,String str2)
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
        String str=find_presence(str1,str2);
        System.out.println(str);
    }
}
