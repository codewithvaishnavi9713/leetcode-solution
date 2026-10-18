class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=-1;
        int last=-1;
        int n=nums.length;
        int lo=0,hi=n-1;
        int ans=-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(target==nums[mid]){
                first=mid;
                hi=mid-1;
            }
            else if(target<nums[mid]){
                
               hi=mid-1;
            }
            else{
                lo=mid+1;
            }

            
        }
        lo=0;hi=n-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(nums[mid]==target){
                last=mid;
                lo=mid+1;

            }
            else if(nums[mid]<target){
                lo=mid+1;
                
              
            }
            else{
                hi=mid-1;
            }
            

        }
    
     return new int[]{first,last};
    }
}      