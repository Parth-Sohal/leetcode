class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        HashMap<Integer,Integer> mpp = new HashMap<>();
        Stack<Integer> st = new Stack<>();

        for(int i = nums2.length - 1; i >= 0 ; i--){

            int val = nums2[i];

            while(!st.isEmpty() && val > st.peek()){
                st.pop();
            }

            if(st.isEmpty()){
                mpp.put(val,-1);
            }else{
                mpp.put(val,st.peek());
            }
            
            st.push(val);
        }

        for(int i = 0 ; i < nums1.length ; i++){
            nums1[i] = mpp.get(nums1[i]);
        }

        return nums1; 


    }
}