class Solution {
public:
    void sortColors(vector<int>& nums) {
        int i = 0, j = 0, k = nums.size() - 1;
        while (j <= k) {
            while (j <= k && nums[i] == 0) {
                i++;
                if (i > j) {
                    j = i;
                }
            }
            while (j <= k && nums[k] == 2) {
                k--;
            }
            if(j>k) continue;
            if(j <= k && nums[j]==0){
                swap(nums[i], nums[j]);
                j++;
                i++;
            }else if(j <= k && nums[j]==2){
                swap(nums[k], nums[j]);
                k--;
            } else{
                j++;
            }
        }
    }
};