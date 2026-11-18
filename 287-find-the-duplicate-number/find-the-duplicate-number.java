class Solution {
    public int findDuplicate(int[] arr) {
        int slow = arr[0] ; 
        int fast = arr[0] ;

        while(true){

            slow = arr[slow];
            fast = arr[arr[fast]];

            if(fast == slow){
                slow = arr[0];
                while(slow != fast){
                    slow = arr[slow];
                    fast = arr[fast];
                }
                 break ;
            }

           

        }

        return slow; 
    }
}


