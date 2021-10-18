package edu.parinya.softarchdesign.structural;

public abstract class HealthcareWorkerDecorator implements HealthcareServiceable{
    protected HealthcareServiceable worker;
    public HealthcareWorkerDecorator(HealthcareServiceable worker){

        this.worker=worker;

    }
    public void service(){
        worker.service();
    }
    public double getPrice(){
        return  worker.getPrice();
    }
}
