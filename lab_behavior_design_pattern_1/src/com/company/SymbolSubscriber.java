package com.company;

import java.util.concurrent.Flow;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class SymbolSubscriber extends StringSubscriber{
    @Override
    public void onSubscribe(Flow.Subscription subscription) {
    }

    @Override
    public void onNext(String item) {
        System.out.print("Symbol: ");
        System.out.println(item);

        try {
            FileWriter myWriter = new FileWriter("Symbol.txt",true);
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
        return !item.matches("[a-zA-Z0-9 ]*");
    }
}
