package com.treinando;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        Person first_person = new Person("Rafael", 22, new Address("Rua Joaquim Nogueira", "Alagoinhas", "Bahia"));
        Person second_person = new Person("Marcelo", 22, new Address("Petrolar", "Alagoinhas", "Bahia"));

        people.add(first_person);
        people.add(second_person);

        people.forEach(System.out::println);

    }
}