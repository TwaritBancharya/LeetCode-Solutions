class Solution {
    public int reverse(int x) {
        boolean isNegative=false;

        if(x<0){
            isNegative=true;
            x=-x;
        }
         long reverse=0;
         while(x>0){
            int remainder=x%10;
            reverse= reverse*10 + remainder;
            x=x/10;

         }
        if(reverse > Integer.MAX_VALUE){
            return 0;
        }
         return (int) (isNegative ? -reverse : reverse);
    }
}