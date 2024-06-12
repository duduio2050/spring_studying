package Thread;

public class RuntimeThread {

    CustomThread thread = new CustomThread();

    public void startThread(){
        thread.start();
    }

    public static void main(String[] args) {
        RuntimeThread runtimeThread = new RuntimeThread();
        // 쓰레드 실행
        runtimeThread.startThread();
    }
}
