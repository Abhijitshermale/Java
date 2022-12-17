
public class Binary {
    public static boolean checkBinary(int[] arr, int low, int high, int key)
    {
        int mid = (low + high) / 2;

        if(low > high)
            return false;
        
        if(arr[mid] == key)
            return true;

        if (key < arr[mid])
            return checkBinary(arr, low, mid-1, key);
        
        return checkBinary(arr, mid+1, high, key);
    }
    public static void main(String[] args) {
   
        int[] arr = {2, 5, 9, 13, 17, 21, 30};
        if(checkBinary(arr, 0, (arr.length-1), 30))
            System.out.println(" Element Found. ");
        else
            System.out.println(" Element not Found.");
     }
}
