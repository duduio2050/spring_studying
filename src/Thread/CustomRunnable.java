package Thread;

public class CustomRunnable implements Runnable{
    public void run(){
        for (int i = 0; i < 10; i++){
            System.out.println("Runnable " + i + " is running.");
        }
    }
}
