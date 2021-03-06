package edu.parinya.softarchdesign.structural;

public class TaxPayingHealthcareWorker extends HealthcareWorkerDecorator {

    public TaxPayingHealthcareWorker(String name, double price) {
        super(name, price);
        System.out.println("Decorate "+super.getName()+"with TaxPaying.");
    }

    public TaxPayingHealthcareWorker(HealthcareWorker worker) {
        super(worker);
        System.out.println("Decorate "+super.getName()+"with TaxPaying.");
    }

    public double getPrice(){
        return super.getPrice()*1.1 ;
    }
}
