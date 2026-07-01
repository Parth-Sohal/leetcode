class Solution {

    public static boolean isValid(int[] a1, int[] a2) {

        for (int i = 0; i < a1.length; i++) {
            if (a1[i] > a2[i]) {
                return false;
            }
        }
        return true;
    }

    public String minWindow(String s, String t) {

        if(t.length() > s.length())return "" ;



        int[] count1 =  new int[256];
        int[] count2 =  new int[256];

        for(int i = 0 ; i < t.length() ; i++){
            char c = t.charAt(i);
            count1[c]++;
        }


        int start = 0 ;
        int a = -1 ;
        int b = -1 ;
        int min = s.length()+1;

        for(int i = 0 ; i < s.length() ; i++){

            char c = s.charAt(i);

            if(count1[c] > 0){
                count2[c]++;
            }

            while(isValid(count1 , count2)){

                int l = i - start +  1 ;

                if(l < min){
                    min = l ;
                    a = start ;
                    b = i ;
                }

                char ch = s.charAt(start++);

                if(count1[ch] > 0){
                    count2[ch]-- ;
                }


            }

        }


        if( a== -1 || b == -1){
            return "";
        }

        return s.substring(a,b+1) ;

    }
}