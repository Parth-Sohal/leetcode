class Solution {

    public  List<String> binary(int num , int n , String ans , List<String> finalAns) {

        if(ans.length() == n){
            finalAns.add(new String(ans));
            // System.out.println(ans);
            return finalAns;
        }

        if(ans.isEmpty() || ans.charAt(ans.length()-1) == '1'){
            binary(num+1 , n , ans+'0' , finalAns);
        }

        binary(num+1 , n , ans + "1" ,finalAns);

        

        return finalAns;


    }

    public List<String> validStrings(int n) {
        return binary(0,n,"",new ArrayList<>());
    }
}