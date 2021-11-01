package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
     StringPublisher publisher=new StringPublisher();
     StringSubscriber alpha=new AlphabetSubscriber();
     StringSubscriber num=new NumberSubscriber();
     StringSubscriber sym=new SymbolSubscriber();
     publisher.subscribe(alpha);
     publisher.subscribe(sym);
     publisher.subscribe(num);

     while(true) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Input: ");
      String item = sc.nextLine();
      if(item.equals(":wq")){
        System.out.println("---Save and Quit---");
        break;
      }else{
       publisher.publish(item);
      }

     }



    }
}
