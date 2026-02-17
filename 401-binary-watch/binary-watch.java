class Solution {

     public  String format(int h , int m){

        String min = "";
        if( m < 10 ){
            min = "0" + m;
        }else{
            min = ""+m;
        }

        return h + ":" + min;
    }

    public List<String> readBinaryWatch(int turnedOn) {

        List<String> ans = new ArrayList<>();

        for(int i = 0 ; i < 12 ; i++){
            for(int j = 0 ; j < 60 ; j++){
                if(Integer.bitCount(i) + Integer.bitCount(j) == turnedOn){
                    ans.add(format(i,j));
                }
            }
        }

        return ans ; 

    }



}