package main4;

import main4.MainThread4;
import java.util.LinkedList;

/**
 * This class is actually class 3. It simulates a factory.
 */
public class Main4 {
    public static void main(String[] args) throws InterruptedException {
        LinkedList<Integer> linkedList = new LinkedList<>();
        MainThread4 mainThread4 =new MainThread4();

        mainThread4.produce(linkedList);




    }
}
