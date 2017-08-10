
public class Main {

    public static void main(String[] args) {

        Caller caller = new Caller();

        for (int i = 0; i < 5; i++) {
            new Worker(caller).start();
        }

        System.out.println(caller.getStatuses());
    }
}