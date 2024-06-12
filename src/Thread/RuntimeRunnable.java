package Thread;

public class RuntimeRunnable {

    CustomRunnable customRunnable = new CustomRunnable();
    Thread thread = new Thread(customRunnable);

    public void startRunnable(){
        thread.start();
    }

    public static void main(String[] args) {
        RuntimeRunnable runtimeRunnable = new RuntimeRunnable();
        runtimeRunnable.startRunnable();
    }
}
