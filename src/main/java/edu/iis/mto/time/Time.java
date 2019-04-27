package edu.iis.mto.time;

import org.joda.time.DateTime;

import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;

public class Time  {
   public DateTime time;



    public Time() {
        this.time = DateTime.now();
    }

    public Time(DateTime time) {
        this.time = time;
    }

    public DateTime getTime() {
        return time;
    }
    public void changeTime(DateTime time){
        this.time=time;
    }
}
