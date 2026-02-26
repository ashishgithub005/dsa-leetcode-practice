class Solution {
    public String longestCommonPrefix(String[] strs) {

        if(strs.length < 1) return "";

        String first = strs[0];
        for(int i=0; i < first.length(); i++){              
            for(int j=1; j < strs.length; j++){
                 String otherString = strs[j];
                 if(i >= otherString.length() || first.charAt(i) != otherString.charAt(i)){
                    return first.substring(0, i);
                 }    
            }
        
        }

        return first;
    }
}