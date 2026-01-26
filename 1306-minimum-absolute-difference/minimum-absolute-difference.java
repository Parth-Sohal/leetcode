class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {

        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;

        for(int i = 1 ; i < arr.length ; i++){

            int diff = arr[i] - arr[i-1];

            if(diff <= minDiff){

                List<Integer> temp = new ArrayList<>();

                if(diff < minDiff){
                    list.clear();
                    minDiff = diff;
                }

                temp.add(arr[i-1]);
                temp.add(arr[i]);
                list.add(temp);
            }
        }

        return list;

    }
}