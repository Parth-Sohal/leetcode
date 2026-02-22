class Solution {

    public static List<String> listExpression(
            int idx  ,
            long currVal ,
            long last ,
            String num ,
            String ans ,
            int k,
            List<String> list
    ){

        if(idx == num.length()){
                if(currVal == k){
//                    System.out.println();
                    list.add(ans);
                    // System.out.println("CurrIdx : "  + idx + " currVal : " + currVal + " string : " + ans);
                }

            return list;
        }

       long m = 0 ;
        for(int i = idx ; i < num.length(); i++){


            if (i > idx && num.charAt(idx) == '0') break;

            m = m * 10 + (num.charAt(i) - '0');

            if(idx == 0){
                listExpression(i + 1, m , m , num , "" + m, k,list);
            }

            else{
                listExpression(i + 1, currVal + m, m, num , (ans+ "+" + m)  , k ,list);
                listExpression(i + 1, currVal - m,-m , num , (ans+ "-" + m)  , k ,list);

                listExpression(i + 1, currVal - last + last * m, last * m , num , (ans+ "*" + m)  , k ,list);
            }


        }

        return list ;

    }

    public List<String> addOperators(String num, int target) {
        return listExpression(0,0, 0,num,"",target , new ArrayList<>()) ;
    }
}