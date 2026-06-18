class Solution {
    public double angleClock(int hour, int minutes) { 
        
        double hourAngle = (hour%12) * 30 + (minutes * 0.5);

        double minutesAngle = minutes * 6 ; 

        double ans = Math.abs(hourAngle - minutesAngle);

        if(ans > 180)ans = 360 - ans ; 

        return ans ; 




    }
}