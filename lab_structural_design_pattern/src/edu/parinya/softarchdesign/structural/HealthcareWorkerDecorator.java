package edu.parinya.softarchdesign.structural;

public abstract class HealthcareWorkerDecorator extends HealthcareWorker{
    protected HealthcareWorker worker;

    public HealthcareWorkerDecorator(String name, double price) {
        super(name, price);
    }

    public HealthcareWorkerDecorator(HealthcareWorker worker) {
        super(worker);
        this.worker=worker;
    }

    public void service(){
        worker.service();
    }
    public double getPrice(){
        return  worker.getPrice();
    }
}
