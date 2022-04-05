package _04_object_and_class.exercise.stop_watch;

public class StopWatch {
    private long startTime, endTime;

    public StopWatch(){

    }

    public void start(){
        this.startTime = System.currentTimeMillis();
    }

    public void end(){
        this.endTime = System.currentTimeMillis();
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public long getElapsedTime(){
        return (getEndTime() - getStartTime());
    }
}
