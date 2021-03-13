class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        
        List<Integer> pre = new ArrayList<Integer>();
        
        for(int i=0;i<numRows;i++){
            List<Integer> curr = new ArrayList<Integer>();    
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    curr.add(1);
                }else{
                    curr.add(pre.get(j) + pre.get(j-1));
                }
            }
            
            res.add(curr);
            pre = curr;
        }
        return res;
    }
}
