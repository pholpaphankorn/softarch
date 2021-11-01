package com.company;

import java.io.IOException;
import java.util.concurrent.Flow;

public abstract class StringSubscriber implements Flow.Subscriber<String> {
    public abstract void onSubscribe(Flow.Subscription subscription);

    public abstract void onNext(String item);

    public void onError(Throwable throwable){
        throwable.printStackTrace();
    }
    public void onComplete(){

    }
    public abstract boolean checkString(String item);

}
