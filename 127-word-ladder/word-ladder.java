class Solution {
    static class Pair {
        String word;
        int dist;

        Pair(String word, int dist) {
            this.word = word;
            this.dist = dist;
        }

    }

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {

        char[] characters = new char[26];

        for (int i = 0; i < 26; i++) {
            characters[i] = (char) (i + 97);
        }

        HashSet<String> visited = new HashSet<>(); // viisted mark ke leye
        HashSet<String> wordLists = new HashSet<>(wordList);

        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(beginWord, 1));
        visited.add(beginWord);

        while (!queue.isEmpty()) {

            Pair pair = queue.poll(); // pair
            int dist = pair.dist; // distance

            String word = pair.word;
            StringBuilder sb = new StringBuilder();
            sb.append(pair.word);

            if (word.equals(endWord)) {
                return dist ; 
            }

            for (int i = 0; i < word.length(); i++) {

                char ch = word.charAt(i);

                for (Character c : characters) {

                    sb.setCharAt(i, c);

                    if (wordLists.contains(sb.toString()) && !visited.contains(sb.toString())) {
                        visited.add(sb.toString());
                        queue.add(new Pair(sb.toString(), dist + 1));
                    }

                }

                sb.setCharAt(i, ch);

            }

        }

        return 0;
    }
}