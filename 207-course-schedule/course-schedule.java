class Solution {
    public boolean canFinish(int numCourses, int[][] preq) {
        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < numCourses; i++) {
            list.add(new ArrayList<>());
        }

        int[] indegree = new int[numCourses];

        for (int i = 0; i < preq.length; i++) {
            int a = preq[i][0];
            int b = preq[i][1];

            list.get(b).add(a);
            indegree[a]++;
        }

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) {
                q.add(i);
            }
        }

        while (!q.isEmpty()) {

            int ele = q.poll();

            for (int i = 0; i < list.get(ele).size(); i++) {
                int nextCourse = list.get(ele).get(i);
                indegree[nextCourse]--;
                if (indegree[nextCourse] == 0) {
                    q.add(nextCourse);
                }
            }

        }

        for (int i : indegree) {
            if (i != 0) {
                return false;
            }
        }

        return true;

    }
}