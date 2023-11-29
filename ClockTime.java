
/**
* Name: First Last (loginName)
* Course: CSCI 241 - Computer Science I
* Section: 001 <-- choose your section
* Assignment: 1
*
* Project/Class Description:
* (summarize ClockTime here)
*
* Known bugs:
* (write the word none, or describe)
*/
public class ClockTime
{
    // instance variables - replace the example below with your own
    private int hour;
    private int minute;
    private int second;
    
    public ClockTime() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }
    public ClockTime(int hour, int minute, int second) {
        this.second = second;
        this.minute = minute;
        this.hour = hour;
        if(second > 59) {
            this.second = 59;
            this.minute += (int)((second % 60) / 60);
        }
        if(minute > 59) {
            this.minute = 59;
            this.hour += (int)((minute % 60) / 60);
        }
        if(hour > 24) {
            this.hour = 23;
        }
        if(second < 0) {
            this.second = 0;
        }
        if(minute < 0) {
            this.minute = 0;
        }
        if(hour < 0) {
            this.hour = 0;
        }
    }
    public int getHour() {
        return hour;
    }
    public int getMinute() {
        return minute;
    }
    public int getSecond() {
        return second;
    }
    public void setHour(int hour) {
        if(hour > 24) {
            this.hour = 23;
        }
        if(hour < 0) {
            this.hour = 0;
        }
        this.hour = hour;
    }
    public void setMinute(int minute) {
        if(minute > 59) {
            this.minute = 59;
            this.hour += (int)((minute % 60) / 60);
        }
        if(minute < 0) {
            this.minute = 0;
        }
        this.minute = minute;
    }
    public void setSecond(int second) {
        if(second > 59) {
            this.second = 59;
            this.minute += (int)((second % 60) / 60);
        }
        if(second < 0) {
            this.second = 0;
        }
        this.second = second;
    }
    
    public String toString() {
        String time = hour + ":" + minute + ":" + second;
        return time;
    }
    public String toString12() {
        String am = " A.M.";
        String pm = " P.M.";
        int hour12 = hour % 12;
        
        if(hour > 12) {
            return String.format("%02d", hour12) + ":" + minute + ":" + second + pm; 
        }
        return String.format("%02d", hour12) + ":" + minute + ":" + second + am;
    }
    
    public void advance(int x) {
        second += x;
        if(second > 60) {
            minute += (second - 60) / 60 + 1;
            second %= 60;
        }
        if(minute > 60) {
            hour += (minute - 60) / 60 + 1;
            minute %= 60;
        }
        if(hour > 24) {
            hour %= 24;
        }
    }
    public boolean equals(ClockTime x) {
        if(hour == x.hour && minute == x.minute && second == x.second) {
            return true;
        } else {
            return false;
        }
        
    }
}
