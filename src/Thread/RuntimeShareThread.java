package Thread;

public class RuntimeShareThread {

    public static void main(String[] args) throws InterruptedException {

        ShareThread ShareThread = new ShareThread();

        Thread thread = new Thread(()->{
            for (int i = 0; i < 10; i++) {
                ShareThread.addA();
            }
        });

        Thread thread2 = new Thread(()-> {
            for (int i = 0; i < 10; i++) {
                ShareThread.addA();
            }
        });

        thread.start();
        thread2.start();

        thread.join();
        thread2.join();

        System.out.println(ShareThread.a);

    }
}
