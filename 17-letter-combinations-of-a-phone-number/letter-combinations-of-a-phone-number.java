class Solution {

    public List<String> letterCombination(String digit , int i , HashMap<Character, String> map , String ans , List<String> lists){



        if( i == digit.length()){
            // System.out.println(ans);
            lists.add(ans);
            return lists;
        }

        String s = map.get(digit.charAt(i));
        for(int idx = 0 ; idx < s.length() ;idx++){
            letterCombination(digit,i+1,map,ans+s.charAt(idx) ,lists);
        }

        return lists;


    }

    public List<String> letterCombinations(String digits) {

        HashMap<Character, String> map = new HashMap<>();

        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");

        return  letterCombination(digits , 0,map,"" , new ArrayList<>());
    }
}