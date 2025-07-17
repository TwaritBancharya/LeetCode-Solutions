class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double result=0;
        int [] arr=new int[nums1.length+nums2.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<=nums2[j]){
                arr[k]=nums1[i];
                i++;
                k++;
            }else{
                arr[k]=nums2[j];
                j++;
                k++;
            }
        }
        if(i==nums1.length){
            while(k<arr.length){
                arr[k]=nums2[j];
                j++;
                k++;
            }
        }else{
            while(k<arr.length){
                arr[k]=nums1[i];
                i++;
                k++;
            }
        }
        
        int start=0;
        int end=arr.length-1;
        int mid=start +((end-start)/2);
        if(arr.length%2==0){
            result=(double)(arr[mid]+arr[mid+1])/2;
        }else{
            result= (double)arr[mid];
        }
        return result;
    }
}