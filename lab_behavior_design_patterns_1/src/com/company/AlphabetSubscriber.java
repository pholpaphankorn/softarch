package com.company;

import java.io.PrintWriter;
import java.util.concurrent.Flow;
import java.io.FileWriter;
import java.io.IOException;

public class AlphabetSubscriber extends StringSubscriber {


    @Override
    public void onSubscribe(Flow.Subscription subscription) {

    }

    @Override
    public void onNext(String item) {
        System.out.print("Alphabet: ");
        System.out.println(item);
        try {
            FileWriter myWriter = new FileWriter("Alphabet.txt",true);
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
        return item.matches(".*[a-zA-Z]+.*");
    }
}
