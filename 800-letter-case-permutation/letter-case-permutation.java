class Solution {

    public List<String> letterCasePermutation(String s , int idx , String ans , List<String> list) {


        if (idx == s.length()) {
            // System.out.println(ans);
            list.add(new String(ans));
            return list;
        }

        if((s.charAt(idx) >= 'a' && s.charAt(idx) <= 'z') || (s.charAt(idx) >= 'A' && s.charAt(idx) <= 'Z'))  {
            letterCasePermutation(s, idx+1, ans+(s.charAt(idx)+"").toLowerCase() , list);

            letterCasePermutation(s, idx+1, ans+(s.charAt(idx)+"").toUpperCase() ,list);

        }

        else{
            letterCasePermutation(s, idx+1, ans+s.charAt(idx),list);
        }

        return list ;



    }


    public List<String> letterCasePermutation(String s) {
        return letterCasePermutation(s,0,"",new ArrayList<>());
    }
}