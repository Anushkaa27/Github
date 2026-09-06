class Solution {
public:
    // int bitwiseComplement(int n) {
    //     int bit, ans = 0, i = 0;
    //     if(n==0){
    //         return 1;
    //     }
    //     while (n != 0) {
    //         bit = n & 1;
    //         if (bit == 0) {
    //             bit = 1;
    //         } else {
    //             bit = 0;
    //         }

    //         if (bit) {
    //             ans = ans + pow(2, i);
    //         }
    //         i++;
    //         n = n >> 1;
    //     }
    //     return ans;
    // }
    int bitwiseComplement(int n) {
        if (n == 0) {
            return 1;
        }
        int m = n;
        int mask = 0;
        while (m != 0) {
            mask = (mask << 1) | 1;
            m=m>>1;
        }
        int ans = (~n) & mask;
        return ans;
    }
};