class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
StringBuilder sb = new StringBuilder();

        HashMap<String , String> map = new HashMap<>();

        for(List<String> l : knowledge){
            map.put(l.get(0),l.get(1));
        }


        int i = 0 ;
        int n = s.length() ;


        while(i <  n){

            if(s.charAt(i) == '('){

                i++;
                StringBuilder builder = new StringBuilder();

                while(i < n  && s.charAt(i) != ')' ){
                    builder.append(s.charAt(i));
                    i++;
                }


                sb.append(map.getOrDefault(builder.toString(), "?"));

            }

            else{
                sb.append(s.charAt(i));
            }

            i++;

        }


        return sb.toString();
    }
}