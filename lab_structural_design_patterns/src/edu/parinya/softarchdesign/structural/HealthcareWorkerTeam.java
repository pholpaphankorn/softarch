package edu.parinya.softarchdesign.structural;

import java.util.Set;
import java.util.HashSet;

public class HealthcareWorkerTeam implements HealthcareServiceable{
    private Set<HealthcareServiceable> members;
    public HealthcareWorkerTeam(){
        this.members=new HashSet<HealthcareServiceable>();
    }
    public void addMember(HealthcareServiceable member){
        members.add(member);
    }
    public void removeMember(HealthcareServiceable member){
        members.remove(member);
    }
    public void service(){
        for (HealthcareServiceable healthcareServiceable : members) {
            healthcareServiceable.service();
        }

    }
    public double getPrice(){
        int totalPrice=0;
        for (HealthcareServiceable healthcareServiceable : members) {
            totalPrice+=healthcareServiceable.getPrice();
        }
        return totalPrice;
    }
}
