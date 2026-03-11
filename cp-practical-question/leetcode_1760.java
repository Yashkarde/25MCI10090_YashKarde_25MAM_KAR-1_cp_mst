class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        int l = 1;
        int r = 0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]>r){
                r = nums[i]; 
            }
        }

        while(l<r){ 
            int mid = l + (r-l)/2;
            long operations = 0;
            for(int i=0;i<nums.length;i++){
                operations = operations + (nums[i]-1)/mid;
            }
            if(operations<=maxOperations){
                r = mid;
            }
            else{
                l = mid+1;
            }
        }
        return l;
    }
}