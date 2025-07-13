class Solution {
public:
    int bitwiseComplement(int n) {
        int i = 0, number = 0, mask = 0;
        // doesn't work for 0:
        if(n ==0){
            return 1;
        }
        while(n>0){
            int bit = n&1;
            if(bit==0){
                number+=pow(2,i);
            }
            n=n>>1;
            i++;
        }
        // while(n>0)

        return number;
    }
};