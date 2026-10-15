class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int lo=0,hi=nums.length;;
        while(lo<hi){
            int mid=lo+(hi-lo)/2;
            if(nums[mid]==mid){
                lo=mid+1;
            }
            else{
                hi=mid;
            }

           
            
        }return lo;

        
    }
}