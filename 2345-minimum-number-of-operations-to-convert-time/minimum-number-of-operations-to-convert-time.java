class Solution {
    static int helper(int duration) {

        int mod;
        int count = 0;

        if (duration >= 60) {
            mod = duration / 60;
            duration -= (mod * 60);
            count += mod;
        }

        if (duration >= 15) {
            mod = duration / 15;
            duration -= (mod * 15);
            count += mod;
        }

        if (duration >= 5) {
            mod = duration / 5;
            duration -= (mod * 5);
            count += mod;
        }

        count += duration;

        return count;
    }

    public int convertTime(String current, String correct) {
        int currentHour = Integer.parseInt(current.substring(0, 2));
        int currentMinute = Integer.parseInt(current.substring(3));
        int correctHour = Integer.parseInt(correct.substring(0, 2));
        int correctMinute = Integer.parseInt(correct.substring(3));

        int currentTotal = currentHour * 60 + currentMinute;
        int correctTotal = correctHour * 60 + correctMinute;

        int duration = correctTotal - currentTotal;

        return helper(duration);
    }
}