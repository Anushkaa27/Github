class Solution {
public:
    int reverse(int x) {
        int answer = 0;
        while (x != 0) {//int can be negative too >0 doesn't work
            int digit = x % 10;
            if (answer < (INT_MIN / 10) ||
            answer > (INT_MAX / 10)) {
                return 0;
            }
            answer = (answer * 10) + digit;
            x /= 10;
        }
        return answer;
    }
};