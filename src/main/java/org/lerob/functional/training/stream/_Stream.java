package org.lerob.functional.training.stream;

import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.lerob.functional.training.stream._Stream.Gender.*;


public class _Stream {

    public static void main(String[] args) {
        List<Person> people = List.of(
            new Person("Lerob", MALE),
            new Person("Pascale", FEMALE),
            new Person("Oceane", FEMALE),
            new Person("Nivek", MALE),
            new Person("Franck", MALE),
            new Person("Bella", FEMALE),
            new Person("Royle", PREFER_NOT_TO_SAID)
        );

        Function<Person, String> personStringFonction = person -> person.name;
        ToIntFunction<String> length  = String::length;
        IntConsumer println = x -> System.out.println(x);

       people
           .stream()
            .map(person -> person.name)
            .mapToInt(String::length)
            .forEach(System.out::println);

        Predicate<Person> femalePredicate = person -> person.gender.equals(FEMALE);

        boolean containOnlyFemales =  people.stream()
                .noneMatch(femalePredicate);
                //.anyMatch(femalePredicate);
                //.allMatch(femalePredicate);

        System.out.println(containOnlyFemales);
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
        MALE, FEMALE, PREFER_NOT_TO_SAID
    }
}
