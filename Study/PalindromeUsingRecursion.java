import java.util.Scanner;

public class PalindromeUsingRecursion{
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        System.out.println(in+"is palindrome or not ? : "+isPalindrome(in));
    }

    static boolean isPalindrome(String input)
    {
        input = input.toLowerCase();
        String rev = reverseString(input);
        if(rev.equals(input))
        {
            return true;
        }
        return false;
    }

    static String reverseString(String input)
    {
        input = input.toLowerCase();
        if (input == null || input.isEmpty())
        {
            return input;
        }
        return input.charAt(input.length()-1)+reverseString(input.substring(0, input.length()-1));
    }
}
