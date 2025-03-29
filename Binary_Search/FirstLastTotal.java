public class FirstLastTotal {
    public static void find(int[] arr,int target){
        int n = arr.length;
        int first = -1, last = -1;
        int beg = 0;
        int end = n-1;
        while(beg<=end){
            int mid = (beg+end)/2;
            if(arr[mid]==target){
                first = mid;
                end = mid - 1;
            }
            else if(arr[mid]<target){
                beg = mid+1;
            }
            else{
                end = mid - 1;
            }
        }
        beg = 0;
        end = n-1;
        while(beg<=end){
            int mid = (beg+end)/2;
            if(arr[mid]==target){
                last = mid;
                beg = mid + 1;
            }
            else if(arr[mid]<target){
                beg = mid+1;
            }
            else{
                end = mid - 1;
            }
        }

        System.out.println("First occurance: "+first);
        System.out.println("Last Occurance: "+last);
        System.out.println("Total Occurances: "+(last-first+1));
    }
    public static void main(String[] args) {
        int[] a = {1,2,3,3,3,3,4,5};
        int target = 3;
        find(a, target);
    }
}
