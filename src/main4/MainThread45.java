package main4;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.concurrent.ThreadLocalRandom;
import main4.MainThread4;
/**
 *Threads for Main4
 */
public class MainThread45 extends Thread{
    String name;
    MainThread45() throws InterruptedException {
        this.name = String.valueOf(ThreadLocalRandom.current().nextLong(100000, 999999));
    }

    public void consume(LinkedList<Integer> linkedList) {

        for (int i = 0; i < linkedList.size(); i++) {
            if (!linkedList.isEmpty()) {
                System.out.println("Linked list " + linkedList.removeFirst());
               try {
                   linkedList.removeFirst();
               }catch (NoSuchElementException e){
                   e.getMessage();
               }


            }
        }

            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
