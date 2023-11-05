package baitap3.StopWatch1;

public class StopWatch1 {
    private long startTime,stopTime;
    public StopWatch1(){
        stopTime = System.currentTimeMillis();
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getStopTime() {
        return stopTime;
    }

    public void setStopTime(long stopTime) {
        this.stopTime = stopTime;
    }
    public void start(){
        this.startTime = System.currentTimeMillis();
    }
    public void stop(){
        this.stopTime = System.currentTimeMillis();
    }
    public long getElapsedTime1(){
        return this.stopTime - this.startTime;
    }
}
