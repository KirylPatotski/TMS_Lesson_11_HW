package main0;

import java.util.concurrent.ThreadLocalRandom;

/**
 * This class creates 10 threads with random priorities
 */
public class Main0 {
    public static void main(String[] args) {
        int[] string = new int[10];
        MainThread a = new MainThread("a");
        MainThread b = new MainThread("b");
        MainThread c = new MainThread("c");
        MainThread d = new MainThread("d");
        MainThread e = new MainThread("e");
        MainThread f = new MainThread("f");
        MainThread g = new MainThread("g");
        MainThread h = new MainThread("h");

        for (int i = 0; i < string.length; i++) {
            int randomNum = ThreadLocalRandom. current(). nextInt(1,11);
            string[i] = randomNum;
            System.out.println(string[i]);
        }

        a.setPriority(string[0]);
        b.setPriority(string[1]);
        c.setPriority(string[2]);
        d.setPriority(string[3]);
        e.setPriority(string[4]);
        f.setPriority(string[5]);
        g.setPriority(string[6]);
        h.setPriority(string[7]);

        a.start();
        b.start();
        c.start();
        d.start();
        e.start();
        f.start();
        g.start();
        h.start();
    }
}
