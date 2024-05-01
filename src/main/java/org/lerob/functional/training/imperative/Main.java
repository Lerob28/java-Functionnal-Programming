package org.lerob.functional.training.imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import static org.lerob.functional.training.imperative.Main.Gender.FEMALE;
import static org.lerob.functional.training.imperative.Main.Gender.MALE;


public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Lerob", MALE),
                new Person("Pascale", FEMALE),
                new Person("Oceane", FEMALE),
                new Person("Nivek", MALE),
                new Person("Franck", MALE),
                new Person("Bella", FEMALE)
        );

        System.out.println("// Imperative approach ...");
            List<Person> females = new ArrayList<>();

            for (Person person: people) {
                switch (person.gender) {
                    case FEMALE: females.add(person);
                }
            }

            for (Person female: females) {
                System.out.println(female.toString());
            }

        System.out.println("\n// Declarative approach ...");
        Supplier<Predicate<Person>> predicateSupplier = () -> person -> person.gender.equals(FEMALE);
        List<Person> females2 = people.stream()
                    .filter(predicateSupplier.get())
                    .collect(Collectors.toList());

        females2.forEach(System.out::println);
    }

    static class Person {
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender) {
            this.name   = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE, FEMALE
    }
}
