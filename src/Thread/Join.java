package Thread;

import org.w3c.dom.ls.LSOutput;

public class Join {

    public static void main(String[] args) throws InterruptedException {

        CustomThread customThread = new CustomThread();

        CustomThread customThread2 = new CustomThread(){
            @Override
            public void run() {
                for(int i = 0; i < 10; i++){
                    System.out.println("Thread2 : " + i);
                }
            }
        };

        customThread.start();
        customThread.join();

        customThread2.start();
        customThread2.join();

        System.out.println("다 끝났지롱~~~~");

    }
}
