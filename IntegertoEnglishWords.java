class Solution {
    private final String[] tens = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        
    private final String[] lessTwenty = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        
    private final String[] thousands = {"", "Thousand", "Million", "Billion"};
    
    public String numberToWords(int num) {
        if(num==0) 
            return "Zero";
        int i=0;
        String word="";
        
        while(num > 0){
            if(num % 1000 !=0)
                word = helper(num % 1000) + thousands[i] + " " + word;
            num/=1000;
            i++;
        }
        
        return word.trim();
    }
    
    public String helper(int num){
        
        if(num==0)
            return "";
        if(num<20){
            return lessTwenty[num] + " ";
        }
        else if(num<100){
            return tens[num/10] + " " + helper(num%10);
        }
        else
            return lessTwenty[num/100] + " Hundred " + helper(num%100);
        
        //I initially tried if cases >100, >20, else and got indexOutOfBound WHY?
        //I missed edge cases of 100 and 20 and while array was looking for arr[20] there was no 21st element
        //same for 100. num/10 gives 10 but no 11th element in arr[9]...0...9
            
    }
}


