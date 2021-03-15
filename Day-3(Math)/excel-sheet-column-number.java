class Solution {
    public int titleToNumber(String columnTitle) {
        int val =0;
        int i=0,len = columnTitle.length();
        while(i<len){
            char a = columnTitle.charAt(len - 1 - i);
            int temp = a - 'A' +1;
            
            val = val + temp* (i>0? (int)Math.pow(26,i):1);
            i++;
        }
        return val;
    }
}