import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>(Arrays.asList(
                new Person("Kevin", 10),
                new Person("Karl", 24),
                new Person("Ivan", 20),
                new Person("Petr", 14),
                new Person("Ivan", 43)
        ));

        // list.stream().map(Person::getName).distinct().forEach(System.out::println);

       /* String str =  list.stream().map(Person::getName).distinct().collect(Collectors.joining(", ", "Names: ", "."));
        System.out.println(str); */

       /* List<Person> filtered = list.stream().filter(p -> p.getAge() < 18).collect(Collectors.toList());
        System.out.println(filtered);

        double sum = filtered.stream().mapToDouble(Person::getAge).average().getAsDouble();

        System.out.println(sum); */

       list.stream().filter(p -> p.getAge() >= 20 && p.getAge() <= 45).sorted(Comparator.comparingInt(Person::getAge).reversed()).forEach(System.out::println);




    }
}
