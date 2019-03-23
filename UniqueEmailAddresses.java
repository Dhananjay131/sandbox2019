class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for(String email: emails){
            String[] parts = email.split("@");
            int i = parts[0].indexOf('+');
            //String[] data = parts[0].split("\\+");
            if(i>-1) 
                parts[0] = parts[0].substring(0,i);
            
            set.add(parts[0].replace(".","") + "@" + parts[1]);
            
        }
        
        //System.out.println(set);
        return set.size();
    }
}
