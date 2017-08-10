import java.util.Scanner;
import java.util.stream.DoubleStream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter please:");
        int count = scanner.nextInt();
        DoubleStream str = DoubleStream.iterate(0, x -> x + 1).filter(x -> x < count).map(Math::sqrt);
        str.forEach(System.out::println);
    }
}