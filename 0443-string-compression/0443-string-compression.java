class Solution {
    public int compress(char[] chars) {
        //2 pointers : 
        int readIndex = 0;
        int writeIndex = 0;
        while(readIndex<chars.length){
            char currentValue = chars[readIndex];
            int count = 0;
            while(readIndex<chars.length && currentValue == chars[readIndex]){
                count++;
                readIndex++;
            }
            chars[writeIndex++] = currentValue;
            if (count > 1){
                for (char digit : String.valueOf(count).toCharArray()){
                    chars[writeIndex++] = digit;
                }
            }
        }
        return writeIndex;
    }
}