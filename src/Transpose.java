public class Transpose {
    public static String transpose(String str)
    {
        String res="";
        String [] arr=str.split(" ");
        for(int i=0;i<arr.length;i++)
        {
            StringBuilder input1 = new StringBuilder();
            input1.append(arr[i]);
            input1=input1.reverse();
            arr[i]=input1.toString();
            res=res+arr[i];
            if(i==arr.length-1)
                break;
            res=res+" ";
        }
        return res;
    }
    public static void main(String[] args)
    {
     String str="a quick brown fox jumps over the lazy dog";

     String arr=transpose(str);

    }
}
