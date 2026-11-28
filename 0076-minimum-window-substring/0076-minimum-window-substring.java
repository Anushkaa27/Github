class Solution {
    public String minWindow(String s, String t) {
        if ( s.length()==0 || t.length() == 0 || t.length() > s.length()) return "";
        int[] frequency = new int[128];//all possible ASCII values

        for(int i =0; i<t.length(); i++){
            frequency[t.charAt(i)]++;//A->2, B-> 1
        }

        //minLength, startIndex-> subString nikalne ke liye 
        //left- the pointer, remaining- to track the remainging needed strings
        int left = 0;
        int remaining = t.length();
        int minLength = Integer.MAX_VALUE;
        int startIndex = 0;
        //MOVE RIGHT: 
        for(int right=0; right<s.length(); right++){
            char currentValue = s.charAt(right);
            if(frequency[currentValue] > 0){
                remaining--;
            }
            frequency[currentValue]--;

        if(remaining == 0){
            //update the substring by removing unnecessary characters first:
            // int charLeft = s.charAt(left);//this was not updating kyuki it was initialised outaside the while loop 
            while(frequency[s.charAt(left)]<0){
                frequency[s.charAt(left)]++;
                left++;
                // charLeft = s.charAt(left); agar upr var banayege toh neeche update karna padega with new index 
            }

            int windowLength = right - left +1;//since both are inclusive
            if(windowLength<minLength){
                minLength = windowLength;
                startIndex = left;
            }
        }
    }
        if(minLength == Integer.MAX_VALUE) 
        {
            return "";
        }
        return s.substring(startIndex, startIndex+minLength);
    }
}