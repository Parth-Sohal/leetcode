class Solution {
    public int totalMoney(int num) {
     
        int a1 = 28 ;
        int n = num / 7 ;
        int d = 7 ;
        int sumTillWeek = (n * (2 * a1 + (n - 1) * d)) / 2;

        int leftDay = num % 7 ;
        int a2 = 1 * (n + 1);
        int sum  = 0 ;
        
        for(int i = 1 ; i <= leftDay ; i++){
            sum += a2;
            a2++;
        }

        int total = sumTillWeek + sum ; 
        return total ;
    }
}