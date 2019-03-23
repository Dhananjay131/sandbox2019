class Solution {
    public boolean backspaceCompare(String S, String T) {
        String newS = drop(S);
        String newT = drop(T);
        
        return newS.equals(newT);
    }
    
    public String drop(String S){
        Stack<Character> stack = new Stack<>();
        char[] ch1 = S.toCharArray();
        for(int i=0; i< ch1.length; i++){
            if(ch1[i]=='#' && stack.size()==0)
                 continue;
            
            else if(ch1[i]=='#' && stack.size()>0)
                stack.pop();
            else
                stack.push(ch1[i]);
        }
        
        StringBuilder sb = new StringBuilder();
        while(stack.size()!=0){
            sb.append(stack.pop());
        }
        
        return sb.reverse().toString();
    }
}
