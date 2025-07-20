class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        System.out.println(nums.length);
        ArrayList<List<Integer>> list1=new ArrayList<>();
       HashSet <List<Integer>> set=new HashSet<>();
       ArrayList<Integer> list2=new ArrayList<>();
        for(int i=0;i<nums.length-1;i++){
               if(i>0 && nums[i]== nums[i-1]){
                   continue;
              }
              int j=i+1;
              int k=nums.length-1;
              while(j<k){
                int total=nums[i]+nums[j]+nums[k];
                 if(total >0 ){
                    k--;
                 }else if(total < 0){
                    j++;
                 }else{
                      list2.add(nums[i]);
                      list2.add(nums[j]);
                      list2.add(nums[k]);
                      set.add(new ArrayList<>(list2));
                      list2.clear();
                      j++;
                      }
                      
               }

              }
        
        list1.addAll(set);
        return list1;
    }
}