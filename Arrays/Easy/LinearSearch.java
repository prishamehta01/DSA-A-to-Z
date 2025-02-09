/* Linear search is done using a single pass 
Time complexity:O(N)
Space complexity:O(1)
*/
import java.util.*;
public class LinearSearch{
    public static boolean linearSearch(int[] arr,int num){ 
    for(int x:arr){
        if(x==num){
            return true;
        }
    }
    return false;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the size: ");
        n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be searched: ");
        int ele = sc.nextInt();
        boolean result = linearSearch(a,ele);
        System.out.println(result);

    }
}