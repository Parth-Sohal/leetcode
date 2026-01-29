class Solution {

    public  List<String> phoneNumber(int idx ,String digit , String ans , HashMap<Integer,String> mpp ,List<String> list){


        if(idx == digit.length()){

            list.add(new String(ans));
            // System.out.println(ans);

            return list;
        }

        int ch = digit.charAt(idx) - '0';
        String s = mpp.get(ch);
        for(int i = 0; i < s.length() ; i++){
            phoneNumber(idx+1 , digit , ans+s.charAt(i) , mpp ,list);
        }


        return list;

    }

    public List<String> letterCombinations(String digits) {
        HashMap<Integer,String> map = new HashMap<>();

        map.put(2,"abc");
        map.put(3,"def");
        map.put(4,"ghi");
        map.put(5,"jkl");
        map.put(6,"mno");
        map.put(7,"pqrs");
        map.put(8,"tuv");
        map.put(9,"wxyz");


        return (phoneNumber(0,digits,"",map ,new ArrayList<>()));
    }
}