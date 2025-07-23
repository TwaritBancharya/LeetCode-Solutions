class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int cap=0;
        while(i<j){
            if(height[i]>=height[j]){
              int temp=Math.min(height[i],height[j])*(j-i);
              cap=Math.max(cap,temp);
              j--;
            }else{
                 int temp=Math.min(height[i],height[j])*(j-i);
                 cap=Math.max(cap,temp);
                 i++;
            }
            
        }
        return cap;
    }
}