public class ContainerMostWater {
    public static int maxArea(int[] height) {
        int left=0;
        int right = height.length-1;
        int maxCon = Integer.MIN_VALUE;
        while(left<right){
            maxCon = Math.max(maxCon,(right-left)*(Math.min(height[left],height[right])));
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxCon;
    }
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        int res = maxArea(height);
        System.out.println(res);
    }
}
