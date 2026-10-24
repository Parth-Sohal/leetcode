class Solution {

    public  int countDaysToYear(String date) {

        int[] dayOfYear = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        int month = Integer.parseInt(date.substring(0, 2));
        int day = Integer.parseInt(date.substring(3));

        int num = 0;

        for (int i = 1; i < month; i++) {
            num += dayOfYear[i];
        }

        num += day;
        // System.out.println(num);

        return num;

    }

    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {

       int aliceStart = countDaysToYear(arriveAlice);
        int aliceEnd = countDaysToYear(leaveAlice);
        int bobStart = countDaysToYear(arriveBob);
        int bobEnd = countDaysToYear(leaveBob);
        
       // The latest start date and the earliest end date of their stays
        int latestStart = Math.max(aliceStart, bobStart);
        int earliestEnd = Math.min(aliceEnd, bobEnd);

        // If latestStart <= earliestEnd, they overlap by this many days
        return Math.max(0, earliestEnd - latestStart + 1);

    }
}