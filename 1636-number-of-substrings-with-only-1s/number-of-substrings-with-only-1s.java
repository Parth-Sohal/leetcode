class Solution {
    public int numSub(String s) {


        long total = 0 ;
        int i = 0 ;
        long mod = 1000000007;


        while(i <  s.length()){

            if(s.charAt(i) == '0'){
                i++;
            }

            else{
                int count = 0 ;

                while(i < s.length() && s.charAt(i) == '1'){
                    count++;
                    i++;
                }

                total += ((long) (count) * (count+1))/ 2 ;

            }

        }

        return (int)(total  % (mod));
    }
}