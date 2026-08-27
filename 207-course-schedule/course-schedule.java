class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        int[] indegree = new int[numCourses];

        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] prerequisite : prerequisites) {
            int course = prerequisite[0];
            int prerequisiteCourse = prerequisite[1];

            graph.get(prerequisiteCourse).add(course);
            indegree[course]++;
        }

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < indegree.length; i++) {
            if (indegree[i] == 0) {
                queue.add(i);
            }
        }

        int k = 0;
 

        while (!queue.isEmpty()) {

            int val = queue.poll();
            k++;

            for (Integer neighbour : graph.get(val)) {
                indegree[neighbour]--;
                if (indegree[neighbour] == 0) {
                    queue.add(neighbour);
                }
            }

        }

        if (k != numCourses) {
            return false;
        }

        return true ;

    }
}