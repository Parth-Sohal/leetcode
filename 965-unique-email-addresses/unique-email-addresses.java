class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> hashSet = new HashSet<>();

        for(String s : emails){

            s = s.trim();

            if(hashSet.contains(s)){
                continue;
            }


            int i = 0 ;

            StringBuilder sb = new StringBuilder();

            while(i < s.length() && s.charAt(i) != '@'){

                if(s.charAt(i) == '.'){
                    i++;
                    continue;
                }

                if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
                    sb.append(s.charAt(i));
                }


                else if(s.charAt(i) == '+'){
                    while(i < s.length() && s.charAt(i) != '@'){
                        i++;
                    }
                    break ;
                }


                i++;
            }

            sb.append(s.substring(i));
            // System.out.println(sb);

            hashSet.add(sb.toString()) ;

        }




        // System.out.println(hashSet.size());

        return hashSet.size();
    }
}