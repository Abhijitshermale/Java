import java.util.*;

public class Palindrome
{
    public static void main(String args[]){
    int j=12321;
    String s=String.valueOf(j);
    String s1 = "";
    System.out.println("First"+s);//200100 because + is string concatenation operator  
    for (int i = s.length()-1 ; i >= 0  ; i--)
    {
        s1 += s.charAt(i);
    }
    System.out.println("Second"+s1);
    int k = Integer.valueOf(s1);
    if (j == k)
    {
        System.out.println("It's Amstrong Number");
    }
    String a = "abhijit";
    
    }
}