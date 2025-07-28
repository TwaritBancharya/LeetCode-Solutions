class Solution {
    public String reverseWords(String s) {
         String[] arr = s.trim().split("\\s+");
        String A = "";
        
        
        for (int i = arr.length - 1; i >= 0; i--) {
            if (A.isEmpty()) {
                A = arr[i]; 
            } else {
                A = A + " " + arr[i]; 
            }
        }
        
        return A;
    }
}