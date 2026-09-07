class Solution {
    public int openLock(String[] deadends, String target) {
        Queue<String> q = new LinkedList<>();
        HashSet<String> visited = new HashSet<>();

        HashSet<String> set = new HashSet<>(Arrays.asList(deadends));

        q.add("0000");
        visited.add("0000");

        if(set.contains("0000")){
            return -1; 
        }

        int steps = 0;

        while (!q.isEmpty()) {

            int size = q.size();

            for (int i = 0; i < size; i++) {

                String curr = q.poll();

                if (curr.equals(target)) {
                    return steps ; 
                }

                char[] arr = curr.toCharArray();

                for (int j = 0; j < 4; j++) {

                    int digit = arr[j] - '0';

                    // +1
                    int next = (digit + 1) % 10;
                    arr[j] = (char) (next + '0');

                    String nextString = String.valueOf(arr);

                    if (!visited.contains(nextString) &&
                            !set.contains(nextString)) {

                        visited.add(nextString);
                        q.offer(nextString);
                    }

                    // -1
                    next = (digit + 9) % 10;
                    arr[j] = (char) (next + '0');

                    nextString = String.valueOf(arr);

                    if (!visited.contains(nextString) &&
                            !set.contains(nextString)) {

                        visited.add(nextString);
                        q.offer(nextString);
                    }

                    // restore original digit
                    arr[j] = (char) (digit + '0');
                }
            }

            steps++;
        }

        return -1; 
    }
}