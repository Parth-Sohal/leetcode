class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        
int[][] arr = new int[position.length][2];


        for(int i = 0 ; i < position.length ; i++){
            arr[i][0] = position[i];
            arr[i][1] = speed[i];
        }



        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        // System.out.println(Arrays.deepToString(arr));

        int fleet = 0 ;
        double curr = 0 ;

        for(int i = arr.length - 1 ; i >= 0 ; i--){

            double ctime = (double)(target - arr[i][0])  / arr[i][1];

            if(ctime > curr){
                fleet++;
                curr = ctime;
            }
        
        }

        return fleet ; 

    }
}