class Solution {
public:
    int bitwiseComplement(int n) {
        int i = n, number = 0, mask = 0;
        // doesn't work for 0: edge case
        if(n ==0){
            return 1;
        }
        while(i>0){
            //ANOTHER WAY TO SOLVE THIS:
            mask = (mask<<1) | 1;
            i = i >> 1;

            // MY METHOD:
            // int bit = n&1;
            // if(bit==0){
            //     number+=pow(2,i);
            // }
            // n=n>>1;
            // i++;
        }
        return number = (mask & ~n);
    }
};