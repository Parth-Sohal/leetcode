class Solution {
    public int maxDepth(String s) {

        int max = 0 ; 

        Stack<Character> stack = new Stack<>();

        for(int i = 0 ; i < s.length() ; i++){

            if(s.charAt(i) == '('){
                stack.push('(');
            }

            else if(s.charAt(i) == ')'){
                max = Math.max(stack.size() , max);
                stack.pop();
            }

        }


        return max ; 
        
    }
}