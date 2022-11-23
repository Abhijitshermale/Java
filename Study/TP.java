import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input1=sc.nextLine();
        String input = input1.replace(" ", "");
        int mainCount=0;
        Set<Character> mainChar = new HashSet<Character>();
        for(int i=0;i<input.length();i++)
        {
            int count=0;
            for(int j=0;j<input.length();j++)
            {   
                    if(input.charAt(i)==input.charAt(j))
                    {
                        count++;
                    }       
            }
            if(count>=mainCount)
            {
                mainCount=count;
            }
        }
        for(int i=0;i<input.length();i++)
        {
            int count=0;
            for(int j=0;j<input.length();j++)
            {
                    if(input.charAt(i)==input.charAt(j))
                    {
                        count++;
                    }
            }
            if(count>=mainCount)
            {
                mainChar.add(input.charAt(i));
            }
        }
        System.out.println(mainChar+" repeats "+mainCount+" times");
    }
}
// This is a string of characters. This String is long, but not long enough
// ssssgghgSSSSfrfrgaaa
// ssssabcSSS