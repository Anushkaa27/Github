class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        int left = 0;
        int right = n-1;
        while (left < right){
            char value = s[left];
            s[left] = s[right];
            s[right] = value;
            left++;
            right--;
        }
        System.out.print(s);
    }
}