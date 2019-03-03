class Solution {
    public int compareVersion(String version1, String version2) {
        String[] ver1 = version1.split("\\.");                          //String[] levels1 = version1.split("\\.");
                                                                        //In Regex dot (.) has meaning. So to indicate it's the actual character dot, it needs to be escaped as \.
        String[] ver2 = version2.split("\\.");
        int res;
        
        int len = (ver1.length>ver2.length) ? ver1.length : ver2.length;
        
        for(int i=0; i<len; i++){
            Integer i1= (i<ver1.length) ? Integer.parseInt(ver1[i]) : 0;
            Integer i2= (i<ver2.length) ? Integer.parseInt(ver2[i]) : 0;  //store in Integer, must go till higher length array end
                                                                           //1.0.1> 1.0 how to find?
            res = i1.compareTo(i2);                                        //imp func >:1, <:-1, else 0
            
            if(res!=0)
                return res;
            
        }     
        
        return 0;
    }
}
