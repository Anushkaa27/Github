class Solution {
    public int trap(int[] height) {
        //first thing to check for is how much water is being actually trapped on one bar :
        int sum = 0;
        int leftMax = 0;
        for( int i = 1; i<height.length-1; i++){
            int rightMax = 0;
            //for the leftmax :
            
            if(leftMax < height[i-1]){
                leftMax = height[i-1];
            }
            // if(rightMax < height[i+1]){
            //     rightMax = height[i+1];
            // }
            //leftMax
            // for(int j = 0; j<i; j++){
            //     leftMax = Math.max(leftMax, height[j]);
            // }
            
            //for rightMax :
            for(int j = i+1; j<height.length; j++){
                rightMax = Math.max(rightMax, height[j]);
            }

            int possibleWater = Math.min(leftMax, rightMax);
            int actualValue = possibleWater - height[i];

            if (actualValue > 0){//handles edge cases 
                sum += actualValue;
            }
        }
        return sum;
    }
}