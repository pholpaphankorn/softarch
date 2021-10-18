package edu.parinya.softarchdesign.structural;
import java.util.Date;

public class TimeLoggingHealthcareWorker extends HealthcareWorkerDecorator {
    public TimeLoggingHealthcareWorker(HealthcareServiceable worker) {
        super(worker);
     
    }

    public void service(){
        Date date = new Date();
        System.out.print(date.toString()+": ");
        super.service();
    }
}
