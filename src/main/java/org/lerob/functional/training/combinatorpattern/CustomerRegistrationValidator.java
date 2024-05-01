package org.lerob.functional.training.combinatorpattern;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;
import static org.lerob.functional.training.combinatorpattern.CustomerValidationResult.*;

public interface CustomerRegistrationValidator extends Function<Customer, CustomerValidationResult> {
    static CustomerRegistrationValidator isEmailValid() {
        return customer -> customer.getEmail().contains("@")
            ? SUCCESS
            : EMAIL_NOT_VALID;
    }

    static CustomerRegistrationValidator isValidPhoneNumber() {
        return customer -> customer.getPhoneNumber().startsWith("+")
            ? SUCCESS
            : PHONE_NUMBER_NOT_VALID;
    }

    static CustomerRegistrationValidator isAdultPerson() {
        return customer -> Period.between(customer.getDateOfBirth(), LocalDate.now()).getYears() > 16
            ? SUCCESS
            : IS_NOT_AND_ADULT;
    }

    default CustomerRegistrationValidator and (CustomerRegistrationValidator other) {
        return customer -> {
            CustomerValidationResult result = this.apply(customer);
            return result.equals(SUCCESS)
                    ? other.apply(customer)
                    : result;
        };
    }
}
