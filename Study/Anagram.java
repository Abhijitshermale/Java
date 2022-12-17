import java. util .*;
public class Anagram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("First String : ");
        String firstString = sc.nextLine();
        System.out.println("Second String : ");
        String SecondString = sc.nextLine();

        if(firstString.length() == SecondString.length())
        {
            char[] firstArray = firstString.toCharArray();
            char[] secondArray = SecondString.toCharArray();

            Arrays.sort(firstArray);
            Arrays.sort(secondArray);

            boolean isAnagram = Arrays.equals(firstArray, secondArray);

            System.out.println("String's are anagram or not ? : "+isAnagram);
        }
    }
}
