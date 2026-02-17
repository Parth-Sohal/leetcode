class Solution {

    public List<String> binaryWatch(int[] curr , int idx , int hour , int min , int currCount , int n , int[] arr , List<String> lists){

        if(hour > 11 || min > 59){
            return lists;
        }

        if(currCount == n){
//            System.out.println("min : " + min + " " + " hour : " + hour);
             String minS = "";
            if(min < 10){
                minS = "0" + min;
            }else{
                minS = ""+min;
            }

            String s = hour + ":" + minS;
            lists.add(s);
            return lists ;
        }



        for(int i = idx ; i < curr.length; i++){

            curr[i] = 1 ;

            if(i <= 3){
                binaryWatch(curr,i+1,hour + arr[i],min,currCount+1,n,arr,lists);
            }

            else{
                binaryWatch(curr,i+1,hour,min+arr[i],currCount+1,n,arr,lists);
            }

            curr[i] = 0 ; // backtrack
        }
        
        return lists;   





    }



    public List<String> readBinaryWatch(int turnedOn) {
        int[] arr = {8, 4, 2, 1, 32, 16, 8, 4, 2, 1};
        int[] build = new int[arr.length];

        return binaryWatch(build,0,0,0,0,turnedOn,arr,new ArrayList<>());
    }
}