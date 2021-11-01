package com.company;

import java.util.concurrent.Flow;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
public class NumberSubscriber extends StringSubscriber{
    @Override
    public void onSubscribe(Flow.Subscription subscription) {

    }

    @Override
    public void onNext(String item) {
        System.out.print("Number: ");
        System.out.println(item);
        try {
            FileWriter myWriter = new FileWriter("Number.txt",true);
            PrintWriter myPrinter=new PrintWriter(myWriter);
            myPrinter.println(item);
            myPrinter.close();
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    @Override
    public boolean checkString(String item){
        return item.matches(".*\\d.*");
    }
}
