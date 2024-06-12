package Thread;

public class ShareThread {
    public int a = 0;

    synchronized public void addA(){
        a++;
    }
}
