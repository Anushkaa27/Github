class Solution {
public:
    bool uniqueOccurrences(vector<int>& arr) {
        vector<int> ans;
        sort(arr.begin(), arr.end());
       int i = 0;
       while(i<arr.size()){
        int count = 1;
        int next = i+1;//index of the next element 
        while(next < arr.size() && arr[i]==arr[next]){
            count++;
            next++;
        }
        i=next;
        ans.push_back(count);
       }
       sort(ans.begin(), ans.end());
       for(int i = 0; i < ans.size()-1; i++){
        if(ans[i]== ans[i+1]){
            return false;
        }
       }
       return true;
    }
};