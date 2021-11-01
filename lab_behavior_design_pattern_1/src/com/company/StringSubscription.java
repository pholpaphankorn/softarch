package com.company;
import java.util.concurrent.Flow;
import java.util.ArrayList;
import java.util.List;
public class StringSubscription implements Flow.Subscription {


    public StringSubscription(Flow.Subscriber<? super String> subscriber,String item) {

    }


    @Override
    public void request(long n) {

    }

    @Override
    public void cancel() {

    }
}
