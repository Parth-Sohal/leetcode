class Solution {
    public List<String> stringMatching(String[] words) {
        Arrays.sort(words, Comparator.comparingInt(String::length).reversed());

        ArrayList<String> list;
        list = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {

            if ((i != 0 && words[i].equals(words[i - 1])) || (words[i].equals("-1"))) {
                continue;
            }

            String first = words[i];

            for (int j = i + 1; j < words.length; j++) {

                if (first.contains(words[j])) {
                    list.add(words[j]);
                    words[j] = "-1";
                }

            }

        }

        return list;
    }
}