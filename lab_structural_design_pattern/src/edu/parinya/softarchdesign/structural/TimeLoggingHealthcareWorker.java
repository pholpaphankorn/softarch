package edu.parinya.softarchdesign.structural;
import java.util.Date;

public class TimeLoggingHealthcareWorker extends HealthcareWorkerDecorator {
    public TimeLoggingHealthcareWorker(String name, double price) {
        super(name, price);
        System.out.println("Decorate "+super.getName()+"with TimeLogging.");
    }

    public TimeLoggingHealthcareWorker(HealthcareWorker worker) {
        super(worker);
        System.out.println("Decorate "+super.getName()+"with TimeLogging.");
    }

    public void service(){
        Date date = new Date();
        System.out.print(date.toString()+": ");
        super.service();
    }
}
