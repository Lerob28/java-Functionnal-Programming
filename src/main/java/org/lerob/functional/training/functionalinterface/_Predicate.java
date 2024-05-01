package org.lerob.functional.training.functionalinterface;

import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {
        System.out.println("Without predicate");
        System.out.println(isValidPhoneNumber("025987456325"));
        System.out.println(isValidPhoneNumber("237685214963"));
        System.out.println(isValidPhoneNumber("237698669212"));
        System.out.println(isValidPhoneNumber("2678523147209"));

        System.out.println();
        System.out.println("With predicate");
        System.out.println(isValidPhoneNumberPredicate.test("025987456325"));
        System.out.println(isValidPhoneNumberPredicate.test("237685214963"));
        System.out.println(isValidPhoneNumberPredicate.test("237698669212"));
        System.out.println(isValidPhoneNumberPredicate.test("2678523147209"));

        System.out.println(
            "Is Phone number valid and contains number 3 = "+
            isValidPhoneNumberPredicate.and(containsNumber3).test("237698669212")
        );
        System.out.println(
            "Is Phone number valid and contains number 3 = "+
            isValidPhoneNumberPredicate.and(containsNumber3).test("297698669212")
        );
        System.out.println(
            "Is Phone number valid or  contains number 3 = "+
            isValidPhoneNumberPredicate.or(containsNumber3).test("237698669212")
        );
    }

    static boolean isValidPhoneNumber(String phoneNumber) {
        return phoneNumber.startsWith("2") && phoneNumber.length() == 12;
    }

    static Predicate<String> isValidPhoneNumberPredicate = phoneNumber -> phoneNumber.startsWith("2") && phoneNumber.length() == 12;

    static  Predicate<String> containsNumber3 = phoneNumber -> phoneNumber.contains("3");
}
