package main4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
/**
 *Threads for Main4
 */
public class MainThread4 extends Thread{

    String name;
    MainThread4() throws InterruptedException {
        this.name = String.valueOf(ThreadLocalRandom.current().nextLong(100000, 999999));
    }

    public void produce(LinkedList<Integer> linkedList) throws InterruptedException {
      int randomNum;
        while (1!=0){
            randomNum = ThreadLocalRandom. current(). nextInt(0, 11);
            System.out.println("Produced " +randomNum);
            linkedList.add(randomNum);
            MainThread45 mainThread45 = new MainThread45();

try {
    mainThread45.consume(linkedList);
}catch (NoSuchElementException e){
    e.getMessage();
}
            try {
                Thread.sleep(randomNum);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
