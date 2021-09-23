package main1;
import main0.MainThread;

import java.io.*;
import java.nio.file.FileAlreadyExistsException;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Different threads create files
 */

public class Main1 {
    public static void main(String[] args) throws InterruptedException {

        MainThread1 a = new MainThread1("a");
        MainThread1 b = new MainThread1("b");
        MainThread1 c = new MainThread1("c");
        MainThread1 d = new MainThread1("d");
        MainThread1 e = new MainThread1("e");
        a.start();
        b.start();
        c.start();
        d.start();
        e.start();

    }
    public void writeFile(){
        int long1 = (int) ThreadLocalRandom.current().nextLong(100000, 999999);
        String fileName = "C:\\Users\\Tatjana\\Lesson11\\src\\" + (long1) + ".txt";
        File myFile = new File(fileName);
        int[] ints = new int[10];
        for (int q = 0; q < ints.length; q++) {
            ints[q] = (int) ThreadLocalRandom.current().nextLong(100000, 999999);
        }
        try {
            myFile.createNewFile();
        } catch (FileAlreadyExistsException e) {
            System.out.println("Failed to create file because file already exists.");
            System.out.println(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try (FileWriter fw = new FileWriter(myFile, true)) {
            for (int j = 0; j < ints.length; j++) {
                fw.write(ints[j] + " ");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
