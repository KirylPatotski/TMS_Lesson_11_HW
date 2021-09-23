package main0;
/**
 * Threads for Class Main0
 */
public class MainThread extends Thread{

    String name;
    public MainThread(String name){
        this.name = name;
    }
    public void run(){
        System.out.println("Runs " + name +" " + this.getPriority());
        try {
            Thread.sleep(1);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Done " + name);
    }

}
