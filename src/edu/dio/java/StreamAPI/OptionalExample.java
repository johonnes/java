package edu.dio.java.StreamAPI;

import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {
      
        // Optional<String> optionalValue = Optional.ofNullable(null);
        // String result = optionalValue.orElseGet(() -> "Value from Supplier");
        //  System.out.println(result);

         Optional<String> optionalValue = Optional.of("Hello");
         optionalValue.ifPresent(value -> System.out.println("Valor presente: " + value));
    }
}