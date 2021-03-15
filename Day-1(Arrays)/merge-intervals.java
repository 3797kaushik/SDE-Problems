class Solution {
    public int[][] merge(int[][] intervals) {
        
        // sort the Integers
        Arrays.sort(intervals,(int[] entry1,  
                             int[] entry2)-> entry1[0] - entry2[0]);
        
         /*for(int i=0;i<intervals.length;i++){
           System.out.println(intervals[i][0]+"-"+intervals[i][1]);
        }*/
        int count = intervals.length;
        for(int i=1;i<intervals.length;i++){
            if(intervals[i-1][1] >= intervals[i][0]){
                
                intervals[i][0] = intervals[i-1][0];
                intervals[i][1] = intervals[i][1] >  intervals[i-1][1] ? intervals[i][1] : intervals[i-1][1];
                intervals[i-1][0] = -1;
                count--;
            }
        }
        
        int result[][] = new int[count][2];
        int j=0;
        for(int i=0;i<intervals.length;i++){
            if(intervals[i][0]>=0 ){
                result[j][0] =intervals[i][0];
                result[j][1] =intervals[i][1]; 
                j++;
            }
        }
        return result;
        
    }
}
