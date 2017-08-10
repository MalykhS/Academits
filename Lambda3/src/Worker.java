import java.util.Random;

public class Worker extends Thread {
    private CallBack cb;

    Worker(CallBack cb) {
        this.cb = cb;
    }

    private int somethingDoing() {
        return new Random().nextInt();
    }

    @Override
    public void run() {
        int st = somethingDoing();
        cb.callMeBack(st);
    }
}
