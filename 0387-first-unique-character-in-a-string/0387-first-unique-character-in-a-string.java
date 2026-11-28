class Solution {
    public int firstUniqChar(String s) {
        int[] frequency = new int[26];

        for(int i = 0; i<s.length(); i++){
            frequency[(s.charAt(i)-'a')]++;//we count 
        }
        for(int i = 0; i<s.length(); i++){
            if(frequency[(s.charAt(i)-'a')] == 1){//we check which one is occuring only once 
            return i;//return its index 
            }
        }
        return -1;
    }
}