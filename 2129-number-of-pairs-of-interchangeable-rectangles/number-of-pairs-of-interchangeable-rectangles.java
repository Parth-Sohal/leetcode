class Solution {
    public long interchangeableRectangles(int[][] rectangles) {

        HashMap<Double , Long> mpp = new HashMap<>();


        long ans = 0 ;

        for(int i = 0 ; i < rectangles.length ; i++){
            double d = (double)rectangles[i][0] / rectangles[i][1];
            
            if(mpp.containsKey(d)){
                ans += mpp.get(d) ;
            }

            mpp.put(d,mpp.getOrDefault(d,0L)+1);

        }

        return ans ; 

        
    }
}