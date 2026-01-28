class Solution {

     public static List<String> generate(int open , int close , int n , String ans ,  List<String> list){


        if(open == n && close ==n){
            // System.out.println(ans);
            String temp = ans;
            list.add(temp);
            return list;
        }


        if(open != n){
            generate(open+1, close , n , ans + '(',list);
        }

        if(close < open){
            generate(open, close+1 , n , ans + ')' ,list);
        }

        return list ;
    }


    public List<String> generateParenthesis(int n) {
        

        return generate(0,0,n , "" , new ArrayList<>());

    }
}