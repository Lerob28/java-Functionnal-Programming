package org.lerob.functional.training.optional;

import java.util.Optional;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
        Supplier<IllegalStateException> exception = () -> new IllegalStateException("Exception");
         Optional
            .ofNullable("njeunkweborel@gmail.com")
            .ifPresentOrElse(
                email -> System.out.println("sending Email to : "+email+" ..."),
                () -> System.out.println("Can't send email...")
            );
    }

}
