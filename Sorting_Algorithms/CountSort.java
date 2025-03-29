public class CountSort{
    public static void countSort(int[] arr){
        int n = arr.length;
        int k = arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>k) k = arr[i];
        }
        int[] count = new int[10];
        for(int i=0;i<n;i++){
            count[arr[i]]++;
        }
        for(int i=1;i<=k;i++){
            count[i]+=count[i-1];
        }
        int[] output = new int[n];
        for(int i=n-1;i>=0;i--){
            output[--count[arr[i]]] = arr[i];
        }

        for(int i =0;i<n;i++){
            arr[i] = output[i];
        }
    }
    public static void main(String[] args) {
        int[] a = {3,4,6,1,4,3,2,3,1};
        countSort(a);
        for(int i:a){
            System.out.print(i+" ");
        }
    }
}