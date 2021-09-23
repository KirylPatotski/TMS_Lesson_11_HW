package main2;
import main1.Main1;

import java.time.LocalDateTime;
import java.util.concurrent.ThreadLocalRandom;
/**
 *Threads for Main2
 */
public class MainThread2 extends Thread{

    String name;
    MainThread2() throws InterruptedException {
        this.name = String.valueOf(ThreadLocalRandom.current().nextLong(100000, 999999));
    }
    public synchronized void run() {
        String string = String.valueOf(LocalDateTime.now());
        String asdfg = String.valueOf(string.charAt(11)+ "" + string.charAt(12) +""+ string.charAt(13)+""+string.charAt(14)+""+string.charAt(15)+""+string.charAt(16)+""+string.charAt(17)+""+string.charAt(18)+"");

        System.out.println(asdfg);
        System.out.println("");
        try {
            Thread.sleep(5000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
