class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        if(intervals.length==0){
            return 0;
        }
        Arrays.sort(intervals,new Comparator<int[]>(){
            public int compare(int[] a,int[] b){
                return a[0]-b[0];
            }
        });
        int count=0;
        int prevend=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
          int currstart=intervals[i][0];
          int currend=intervals[i][1];
          if(prevend>currstart){
            count++;
            prevend=Math.min(prevend,currend);
          } 
          else{
             prevend=currend;
          }
        }
        return count;
    }
}