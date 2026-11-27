// class Solution {
//     public int trap(int[] height) {
//         //first thing to check for is how much water is being actually trapped on one bar :
//         int sum = 0;
//         int leftMax = 0;
//         for( int i = 1; i<height.length-1; i++){
//             int rightMax = 0;
//             //for the leftmax :
            
//             if(leftMax < height[i-1]){
//                 leftMax = height[i-1];
//             }
//             // if(rightMax < height[i+1]){
//             //     rightMax = height[i+1];
//             // }
//             //leftMax
//             // for(int j = 0; j<i; j++){
//             //     leftMax = Math.max(leftMax, height[j]);
//             // }
            
//             //for rightMax- if we use the same logic as leftMax then it will not run through all the values after i :
//             for(int j = i+1; j<height.length; j++){
//                 rightMax = Math.max(rightMax, height[j]);
//             }

//             int possibleWater = Math.min(leftMax, rightMax);
//             int actualValue = possibleWater - height[i];

//             if (actualValue > 0){//handles edge cases 
//                 sum += actualValue;
//             }
//         }
//         return sum;
//     }
// }

// //OPTIMISED WAY 1:
// class Solution {
//     public int trap(int[] height) {
//         //FIRST THING : we create a rightMax array :
//         int n = height.length;
//         if (n<2) return 0;
//         int[] rightMax = new int[n];
//         rightMax[n-1] = height[n-1];
//         for (int i = n-2; i>=0; i--){
//             rightMax[i]= Math.max(rightMax[i+1], height[i]);
//         }

//         int sum = 0;
//         int leftMax = 0;
//         for( int i = 1; i<n-1; i++){
//             leftMax = Math.max(leftMax, height[i-1]);
//             int possibleWater = Math.min(leftMax, rightMax[i+1]);
//             int actualValue = possibleWater - height[i];
//             if (actualValue > 0){//handles edge cases 
//                 sum += actualValue;
//             }
//         }
//         return sum;
//     }
// }

//OPTIMISED WAY 1:
class Solution {
    public int trap(int[] height) {
        int n = height.length;
        if(n<2) return 0;
        int left = 0;
        int right = n-1;
        int leftMax = 0;
        int rightMax = 0;
        int sum = 0;

        while(left<right){
            if(height[left]<=height[right]){
                leftMax = Math.max(leftMax, height[left]);
                sum += leftMax-height[left];
                left++;
            } else{
                rightMax = Math.max(rightMax, height[right]);
                sum += rightMax-height[right];
                right--;
            }
        }
        return sum;
    }
}