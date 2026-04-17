class Solution {

    public static int sumSquare(int n){
        if( n== 0)return 0 ;

        int mod = n % 10 ;
        return mod*mod + sumSquare(n/10);

    }

    public boolean isHappy(int n) {

        HashSet<Integer> set = new HashSet<>();

        int temp = n ;

        while(temp != 1){
            temp = sumSquare(temp);
            if(set.contains(temp))return false ;
            set.add(temp);
        }

        return true ; 


    }
}