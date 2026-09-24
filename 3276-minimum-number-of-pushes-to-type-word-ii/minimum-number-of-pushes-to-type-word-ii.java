class Solution {
    static class Pair {
        char c;
        int num;

        Pair(char c, int n) {
            this.c = c;
            this.num = n;
        }
    }

    public  int minimumPushes(String word) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>(
                (a, b) -> b.num - a.num);

        for (Character c : map.keySet()) {

            pq.offer(new Pair(c, map.get(c)));
        }

        int n = 0;
        int sum = 0;

        while (!pq.isEmpty()) {
            Pair p = pq.poll();
        
            if (n < 8) {
                sum += p.num;
            } else if (n < 16) {
                sum += 2 * p.num;
            } else if(n < 24) {
                sum += 3 * p.num;
            }
            else{
                sum += 4 * p.num ; 
            }

            n++;

        }

        return sum;

    }
}