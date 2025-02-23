/*Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array */

public class MajorityElement {

    /*
    //Better Approach - Hashmap to find frequencies - Time Complexity: O(N*logN) + O(N)
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int value = mp.getOrDefault(nums[i],0);
            mp.put(nums[i],value+1);
        }

        for(Map.Entry<Integer,Integer> it: mp.entrySet()){
            if(it.getValue()> (nums.length/2)){
                return it.getKey();
            }
        }
        return -1;
    }
     */

    //Optimal Approach: Moore’s Voting Algorithm - Time complexity:O(n)+O(n) , Space Complexity:O(1)
    public static int majorityElement(int[] nums) {
        int c = nums[0];
        int count = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==c){
                count++;
            }
            else{
                count--;
                if(count==0){
                    c=nums[i];
                    count= 1;
                }
            }
        }
        return c;
    }
    public static void main(String[] args) {
        int[] a = {2,2,1,1,1,2,2};
        int result = majorityElement(a);
        System.out.println("The number that appears more than ⌊n / 2⌋ times is: "+result);
    }
    
}
