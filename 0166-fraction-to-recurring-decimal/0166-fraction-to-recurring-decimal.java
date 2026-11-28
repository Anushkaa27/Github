class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        if(numerator == 0) return "0";
        StringBuilder result = new StringBuilder();//ye isko .toString() krke return krege
        //step 1 : negative :
        if(numerator<0 != denominator<0 ){
            result.append("-");
        }
        //create long - because integer can not be processed for our use case properly:
        long num = Math.abs((long)numerator);
        long den = Math.abs((long)denominator);
        result.append(num/den);
        //remainder bhi long me kyuki out of bound jaa skta hai 
        long remainder = num%den;
        if(remainder == 0){
            return result.toString();//idhr hi khtm
        }
        result.append(".");//decimal laga diya 
        HashMap<Long, Integer> map = new HashMap<>();
        while(remainder != 0){
            if(map.containsKey(remainder)){
            int startRemainderIndex = map.get(remainder);
            result.insert(startRemainderIndex, "(");//jo remainder ka value hai aage move hojayega
            result.append(")"); //at the end. 
            break;
        }
        map.put(remainder, result.length());
        remainder *= 10;//old remainder x 10 /den
        result.append(remainder/den);
        remainder %= den;//new remainder to match with the old one above 
        }

        return result.toString();
    }
}