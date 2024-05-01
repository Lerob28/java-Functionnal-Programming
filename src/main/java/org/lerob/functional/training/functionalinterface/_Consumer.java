package org.lerob.functional.training.functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

    public static void main(String[] args) {
        Customer borel = new Customer("Borel", "+237 698669212");
        greetCustomer(borel);
        greetCustomerConsumer.accept(borel);

        greetCustomerConsumerV2.accept(borel, true);
        greetCustomerConsumerV2.accept(borel, false);

        greetCustomerV2(borel, true);
        greetCustomerV2(borel, false);
    }

    static BiConsumer<Customer, Boolean> greetCustomerConsumerV2 = (customer, showPhoneNumber) -> {
        System.out.println("Hello "+customer.customerName+(showPhoneNumber ? " thanks for registrering "+customer.customerPhoneNumber : ""));
    };

    static Consumer<Customer> greetCustomerConsumer = customer -> {
        System.out.println("Hello "+customer.customerName+" thanks for registrering "+customer.customerPhoneNumber);
    };

    static void greetCustomer(Customer customer) {
        System.out.println("Hello "+customer.customerName+" thanks for registrering "+customer.customerPhoneNumber);
    }

    static void greetCustomerV2(Customer customer, Boolean showPhoneNumber) {
        System.out.println("Hello "+customer.customerName+(showPhoneNumber ? " thanks for registrering "+customer.customerPhoneNumber : ""));
    }

    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;

        Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
