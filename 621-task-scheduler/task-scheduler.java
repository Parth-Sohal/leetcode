class Solution {
    static class Pair {

        Character ch;
        int time;

        Pair(Character ch, int time) {
            this.ch = ch;
            this.time = time;
        }

    }

    public int leastInterval(char[] tasks, int n) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : tasks) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> Integer.compare(a.time, b.time));

        for (char c : map.keySet()) {
            pq.offer(new Pair(c, 0));
        }

        int time = 0;

        while (!pq.isEmpty()) {

            Pair p = pq.poll();

            if (p.time <= time) {

                p.time = p.time + n + 1;

                if (map.get(p.ch) > 1) {
                    pq.offer(p);
                    map.put(p.ch, map.get(p.ch) - 1);
                }

            }

            else {
                pq.offer(p);
            }

            time++;

        }

        return time;

    }
}