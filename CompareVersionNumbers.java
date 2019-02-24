class Solution {
    public int compareVersion(String version1, String version2) {
        String[] ver1 = version1.split("\\.");
        String[] ver2 = version2.split("\\.");
        
        int l = Math.max(ver1.length, ver2.length);
        
        for(int i=0; i<l; i++){
            Integer i1 = i<ver1.length ? Integer.parseInt(ver1[i]) : 0;
            Integer i2 = i<ver2.length ? Integer.parseInt(ver2[i]) : 0;
            
            int val = i1.compareTo(i2);
            
            if(val!=0)
                return val;
            
        }
        
        
        return 0;
    }
}
