package org.lerob.functional.training.combinatorpattern;

import java.time.LocalDate;

import static org.lerob.functional.training.combinatorpattern.CustomerRegistrationValidator.*;
import static org.lerob.functional.training.combinatorpattern.CustomerValidationResult.SUCCESS;

public class Main {

    public static void main(String[] args) {
        Customer borel = new Customer(
        "Borel",
        "njeunkweborel@gmail.com",
 "+237698669212",
            LocalDate.of(2002, 7, 16)
        );

        CustomerValidatorService validationService = new CustomerValidatorService();
        System.out.println(validationService.isValidCustomer(borel));

        // using combinator pattern
         CustomerValidationResult result = isEmailValid()
                .and(isValidPhoneNumber())
                .and(isAdultPerson())
                .apply(borel);

        System.out.println(result);

        if (!result.equals(SUCCESS)) {
            throw new IllegalStateException(result.name());
        }

    }

}
