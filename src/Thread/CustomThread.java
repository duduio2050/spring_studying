package Thread;

public class CustomThread extends Thread{
    public void run(){
        for(int i = 0; i < 10; i++){
            System.out.println("Thread: " + i);
        }
    }
}
