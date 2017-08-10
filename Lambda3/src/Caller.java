import java.util.ArrayList;

public class Caller implements CallBack {
    private final ArrayList<Integer> statuses = new ArrayList<>();

    ArrayList<Integer> getStatuses() {
        return statuses;
    }

    @Override
    public void callMeBack(int status) {
        synchronized (statuses) {
            statuses.add(status);
        }
    }
}
