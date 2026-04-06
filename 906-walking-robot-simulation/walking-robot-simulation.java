class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {

        // HashSet<String> set = new HashSet<>();

        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < obstacles.length && obstacles[i].length == 2; i++) {
            set.add(obstacles[i][0] + "," + obstacles[i][1]);
        }

        int max = 0 ;

        // System.out.println(set);

        int x = 0;
        int y = 0;

        char dirc = 'n';

        for (int i : commands) {

            if (i == -1) { // right turn

                if (dirc == 'n')
                    dirc = 'e';
                else if (dirc == 'e')
                    dirc = 's';
                else if (dirc == 's')
                    dirc = 'w';
                else if (dirc == 'w')
                    dirc = 'n';
            }

            else if (i == -2) { // left turn

                if (dirc == 'n')
                    dirc = 'w';
                else if (dirc == 'w')
                    dirc = 's';
                else if (dirc == 's')
                    dirc = 'e';
                else if (dirc == 'e')
                    dirc = 'n';
            }

            else {

                if (dirc == 'n') {

                    for (int j = 0; j < i; j++) {

                        if (set.contains(x + "," + (y + 1))) {
                            break;
                        }

                        y++;

                    }

                }

                else if (dirc == 's') {

                    for (int j = 0; j < i; j++) {
                        if (set.contains(x + "," + (y - 1))) {
                            break;
                        }
                        y = y - 1;
                    }

                }

                else if (dirc == 'e') {

                    for (int j = 0; j < i; j++) {

                        if (set.contains((x + 1) + "," + (y))) {
                            break;
                        }
                        x = x + 1;
                    }

                }

                else {

                    for (int j = 0; j < i; j++) {

                        if (set.contains((x - 1) + "," + (y))) {
                            break;
                        }
                        x = x - 1;
                    }

                }

                max  = Math.max(((x*x) + (y*y) ) , max) ;

            }

        }

        return max ;
    }
}