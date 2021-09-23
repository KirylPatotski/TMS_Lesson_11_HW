package main1;

import java.io.*;
import java.nio.file.FileAlreadyExistsException;
import java.util.concurrent.ThreadLocalRandom;

/**
 *Threads for Main1
 */
public class MainThread1 extends Thread{

    String name;
    MainThread1(String name) throws InterruptedException {
        this.name = name;
    }


    public void run() {
        Main1 main1 = new Main1();
        main1.writeFile();
        try {

            Thread.sleep(1);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
