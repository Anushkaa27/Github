class Solution {
    public int compress(char[] chars) {
        StringBuilder answerArray = new StringBuilder();
        int count = 1;
        if(chars.length <= 0) return 0;
        for(int i = 1; i<chars.length; i++){
            if(chars[i-1] == chars[i]){
                count++;
            }else{
                answerArray.append(chars[i-1]);
                if(count>1){
                answerArray.append(count);
                }
                count=1;
            }
        }
        answerArray.append(chars[chars.length-1]);
        if(count>1){
            answerArray.append(count);
        }
        for ( int i = 0; i<answerArray.length(); i++){
            chars[i] = answerArray.charAt(i);
        }
        return answerArray.length();
    }
}