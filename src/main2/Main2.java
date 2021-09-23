package main2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Calendar;

/**
 * Several synchronised threads print the time.
 */
public class Main2 {
    public static void main(String[] args) throws InterruptedException {
        MainThread2 mainThread1 = new MainThread2();
        MainThread2 mainThread2 = new MainThread2();
        MainThread2 mainThread3 = new MainThread2();
        MainThread2 mainThread4 = new MainThread2();
        MainThread2 mainThread5 = new MainThread2();
        MainThread2 mainThread6 = new MainThread2();
        MainThread2 mainThread7 = new MainThread2();
        MainThread2 mainThread8 = new MainThread2();
        MainThread2 mainThread9 = new MainThread2();
        MainThread2 mainThread10 = new MainThread2();

        mainThread1.start();
        mainThread2.start();
        mainThread3.start();
        mainThread4.start();
        mainThread5.start();
        mainThread6.start();
        mainThread7.start();
        mainThread8.start();
        mainThread9.start();
        mainThread10.start();


    }



}
