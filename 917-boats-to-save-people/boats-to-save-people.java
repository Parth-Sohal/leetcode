class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int low = 0, n = people.length;
        int high = n - 1;
        int count = 0;

        while (low < high) {

            if (people[low] + people[high] <= limit) {
                low++;
            }

            high--;
            count++;

        }

        if(low == high)count++;

        return count ; 

    }

}