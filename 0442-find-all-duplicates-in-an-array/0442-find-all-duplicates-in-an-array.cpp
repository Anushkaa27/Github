class Solution {
public:
    // vector<int> findDuplicates(vector<int>& nums) {//this can be improved
    //     int i = 0;
    //     vector<int> ans;
    //     sort(nums.begin(), nums.end());
    //     while(i<nums.size()-1){
    //         if(nums[i]==nums[i+1]){
    //             ans.push_back(nums[i]);
    //         }
    //         i++;
    //     }
    //     return ans;
    // }
    vector<int> findDuplicates(vector<int>& nums) {
        vector<int> ans;
        for(int i =0; i<nums.size(); i++){
            int x = abs(nums[i]);
            if(nums[x-1]<0){
                ans.push_back(x);
            }
            nums[x-1]*=-1;
        }
        return ans;
    }
};