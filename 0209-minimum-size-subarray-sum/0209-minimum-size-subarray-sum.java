class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int left = 0;
        int minLength = Integer.MAX_VALUE;
        for(int right=0; right<nums.length; right++){
            sum += nums[right];
            if(sum >= target){
                while(sum - nums[left] >= target){
                sum -= nums[left];
                left++;
            }
            minLength = Math.min(minLength, (right - left + 1));
            // int windowLength = right - left + 1;
            //     if(windowLength < minLength ){
            //         minLength = windowLength;
            //     }
            }
        }
        if(minLength == Integer.MAX_VALUE) {
            return 0;
        }
        return minLength;
    }
}