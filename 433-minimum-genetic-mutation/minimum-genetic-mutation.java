class Solution {

    static class Pair {

        String s;
        int dist;

        public Pair(String s, int dist) {
            this.s = s;
            this.dist = dist;
        }

    }

    public int minMutation(String startGene, String endGene, String[] bank) {

        HashSet<String> banks = new HashSet<>(List.of(bank));

        if (!banks.contains(endGene)) {
            return -1;
        }
        char[] genes = { 'A', 'C', 'G', 'T' };

        Pair p = new Pair(startGene, 0);

        HashSet<String> visited = new HashSet<>();
        visited.add(startGene);

        Queue<Pair> q = new LinkedList<>();
        q.offer(p);

        while (!q.isEmpty()) {

            Pair temp = q.poll();

            String curGene = temp.s;
            int curDist = temp.dist;

            if (curGene.equals(endGene)) {
                return curDist;
            }

            char[] currArr = curGene.toCharArray();

            for (int i = 0; i < currArr.length; i++) {

                char ch = currArr[i];

                for (int j = 0; j < genes.length; j++) {
                    currArr[i] = genes[j];

                    String nextGene = new String(currArr);

                    if (banks.contains(nextGene) && !visited.contains(nextGene)) {
                        visited.add(nextGene);
                        q.add(new Pair(nextGene, curDist + 1));
                    }

                }

                currArr[i] = ch;

            }

        }

        return -1;

    }
}