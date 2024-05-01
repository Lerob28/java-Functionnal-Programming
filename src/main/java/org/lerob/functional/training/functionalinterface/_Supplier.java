package org.lerob.functional.training.functionalinterface;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {

    public static void main(String[] args) {
        System.out.println(getDBConnectionUrl());
        System.out.println(getDBConnectionUrlSupplier.get());
    }

    static Supplier<List<String>> getDBConnectionUrlSupplier = ()
        -> List.of(
            "jdbc://localhost:5432/users?charset=utf-8",
            "jdbc://localhost:5432/bank?charset=utf-8",
            "jdbc://localhost:5432/customer?charset=utf-8"
    );

    static String getDBConnectionUrl() {
        return "jdbc://localhost:5432/users?charset=utf-8";
    }
}
