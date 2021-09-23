package main3;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Threads for class Main3
 */
public class MainThread3 extends Thread{

    String name;
    MainThread3() throws InterruptedException {
        this.name = String.valueOf(ThreadLocalRandom.current().nextLong(100000, 999999));
    }

    public void run() {
        ArrayList myArrayList = new ArrayList();
        while (true) {
            try {
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            myArrayList.add(name);

            try {
                int integer = Integer.parseInt(name);
                if (integer%1 == 0) {
                    String str = String.valueOf(integer);
                    myArrayList.remove(str);
                    if (integer == -1){
                        System.exit(-1);
                    }
                    System.out.println("I will sleep for " +integer/1000 + " second(s)" );
                    Thread.sleep(integer);
                    System.out.println("I slept " + integer/1000 + " second(s)");

                }
            }catch (NumberFormatException e){
                e.getMessage();
            }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
