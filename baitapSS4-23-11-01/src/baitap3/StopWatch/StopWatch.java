package baitap3.StopWatch;

import java.util.Date;

public class StopWatch {
    private Date startTime, endTime;

    public Date getStartTime() {
        return startTime;
    }

    public Date getEndTime() {
        return endTime;
    }
    public StopWatch(){};
    public void start(){
        startTime = new Date();
    }
    public void end(){
        endTime = new Date();
    }
    public long getElapsedTime(){
        return endTime.getTime() - startTime.getTime();
    }
}
