class Solution {
    public int subarrayBitwiseORs(int[] arr) {
        
        Set<Integer> curr = new HashSet<>();
        Set<Integer> res = new HashSet<>();

        for(int i = 0 ; i < arr.length ;i++){

            Set<Integer> temp = new HashSet<>() ;

            int num = arr[i];

            temp.add(num);

            for(int x : curr){
                temp.add(num | x);
            }

            curr = temp ; 
            res.addAll(curr);

        }


        return res.size() ;

    }
}