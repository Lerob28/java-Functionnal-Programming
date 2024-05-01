package org.lerob.functional.training.finalsection;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Lambdas {

    public static void main(String[] args) {

        Function<String, String> upperCaseName  = name -> name.toUpperCase();

        Function<String, String> upperCaseName2 = name -> {
            if (name.isBlank())
                throw new IllegalArgumentException("blank name given");
            return  name.toUpperCase();
        };

        BiFunction<String, Integer, String> upperCaseNameWithAge = (name, age) -> {
            // some logic here with age manipulation before returning name in upperCase ...
          return name.toUpperCase()+" "+age;
        };

        System.out.println( upperCaseName2.apply("  n"));
        System.out.println( upperCaseNameWithAge.apply("Borel", 20));
    }

}
