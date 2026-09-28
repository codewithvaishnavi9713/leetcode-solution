class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(target==nums[i]){//wahan kya ha
                return i;//pos kahan ha
               
    
            }
        }
        return -1; 
    } 
}