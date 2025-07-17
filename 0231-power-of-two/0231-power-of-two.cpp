class Solution {
public:
    bool isPowerOfTwo(int n) {
        int ans = 1;
        for (int i = -31; i < 31; i++) {
            // if(n== pow(2, i)){- instead of calculating the power each time we chose to use the previous value of answer
            if (n == ans) {
                return true;
                break;
            }
            if(ans < INT_MAX/2){
                ans *= 2;
            }
            
        }
        return false;
    }
};