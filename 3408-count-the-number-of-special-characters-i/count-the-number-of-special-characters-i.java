class Solution {
    public int numberOfSpecialChars(String word) {
        

        int[] arr = new int[26] ;


        for(int i = 0 ; i < word.length() ; i++){

            char ch = word.charAt(i);

            if(ch >= 'A' && ch <= 'Z'){
                arr[ch - 'A'] = 1 ; 
            }

        }

        int count = 0 ; 

        for(int i = 0 ; i < word.length() ; i++){

            char ch = word.charAt(i);

            if(ch >= 'a' && ch >= 'Z'){
                if(arr[ch -'a'] == 1)
                {count++;
                    arr[ch - 'a'] = 0 ; 
                }
            }

        }

        return count ; 


    }
}