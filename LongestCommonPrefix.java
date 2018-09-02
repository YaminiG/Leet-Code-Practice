package hello;

class Solution {
    public String longestCommonPrefix(String[] strs) {
       // Queue stackOfCommons = new LinkedList();
        int flag = 0;
        if(strs.length==0){
            return "";
        }
        if(strs.length==1){
            return strs[0];
        }
        int minLength = strs[0].length();
        for(int i = 0;i<strs.length;i++){
            if(strs[i].length()<minLength){
                minLength = strs[i].length();
            }
        }
        System.out.println(minLength);
      String maximumSubstring = strs[0].substring(0,minLength);
        System.out.println(maximumSubstring);
        for(int i = 0;i<strs.length-1;i++){
            while(minLength>=0){
                if(strs[i].substring(0,minLength).equals(strs[i+1].substring(0,minLength))){
                    flag = 1;
                    break;
                }
                else {
                    minLength--;
                    if(minLength>=0)
                    {
                    maximumSubstring = strs[0].substring(0,minLength);
                    }
                }
            }
        }
        if(flag==0){
            maximumSubstring = "";
        }
        return maximumSubstring;
}
}