package ru.academits.malykh.lambda.main;

import ru.academits.malykh.lambda.person.Person;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>(Arrays.asList(
                new Person("Kevin", 10),
                new Person("Karl", 24),
                new Person("Ivan", 20),
                new Person("Petr", 14),
                new Person("Ivan", 43)
        ));

        list.stream().map(Person::getName).distinct().forEach(System.out::println);
        System.out.println();

        String str = list.stream().map(Person::getName).distinct().collect(Collectors.joining(", ", "Names: ", "."));
        System.out.println(str);
        System.out.println();

        List<Person> filtered = list.stream().filter(p -> p.getAge() < 18).collect(Collectors.toList());
        double sum = filtered.stream().mapToDouble(Person::getAge).average().getAsDouble();
        System.out.println(sum);
        System.out.println();

        Map<String, Double> newList = list.stream().collect(Collectors.groupingBy(Person::getName,
                Collectors.averagingDouble(Person::getAge)));
        System.out.println(newList);
        System.out.println();

        list.stream().filter(p -> p.getAge() >= 20 && p.getAge() <= 45).sorted(Comparator.comparingInt(Person::getAge).reversed()).forEach(System.out::println);
        System.out.println();

        list.stream().filter(p -> p.getAge() >= 20 && p.getAge() <= 45).sorted(Comparator.comparingInt(Person::getAge)).forEach(System.out::println);

    }
}
