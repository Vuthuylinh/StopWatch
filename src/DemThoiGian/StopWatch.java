package DemThoiGian;

import java.util.Date;

public class StopWatch {
    private Date startTime;
    private Date endTime;
    public StopWatch(){

    }


    public void start(){
    startTime= new Date();
    }
    public  void stop(){
        endTime=new Date();
    }
    public Date getStartTime(){
        return startTime;
    }
    public  Date getEndTime(){
        return endTime;
    }

    public long getElapsedTime(){
        return endTime.getTime() - startTime.getTime();
    }



}
