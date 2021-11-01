package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Flow;
import java.util.LinkedHashSet;
import java.util.Set;
public class StringPublisher implements Flow.Publisher<String> {
    private Set<Flow.Subscriber<? super String>> subscriberSet;

    public StringPublisher(){
        this.subscriberSet=new LinkedHashSet<>();
    }
    @Override
    public void subscribe(Flow.Subscriber<? super String> subscriber) {
        subscriberSet.add(subscriber);
    }
    public void unsubscribe(Flow.Subscriber<? super String> subscriber) {
        subscriberSet.remove(subscriber);
    }

    public void publish(String item){
            for (Flow.Subscriber<? super String> subscriber : subscriberSet) {
                if (((StringSubscriber) subscriber).checkString(item)){
                    subscriber.onNext(item);
                }
            }


    }

}
