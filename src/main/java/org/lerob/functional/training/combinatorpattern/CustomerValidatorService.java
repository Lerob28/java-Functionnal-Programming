package org.lerob.functional.training.combinatorpattern;

import java.time.LocalDate;
import java.time.Period;

public class CustomerValidatorService {
    private boolean isValidEmail(String email) {
        return email.contains("@");
    }
    private boolean isValidPhoneNumber(String phoneNumber) {
        return phoneNumber.startsWith("+");
    }
    private boolean isAdultPerson(LocalDate dateOfBirth) {
        return Period.between(dateOfBirth, LocalDate.now()).getYears() > 16;
    }

    public boolean isValidCustomer(Customer customer) {
        return  isValidEmail(customer.getEmail()) &&
                isValidPhoneNumber(customer.getPhoneNumber()) &&
                isAdultPerson(customer.getDateOfBirth());
    }

    // validation using combinator pattern

}
