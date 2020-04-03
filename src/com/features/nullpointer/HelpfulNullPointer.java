package com.features.nullpointer;

import java.time.format.DateTimeFormatter;

public class HelpfulNullPointer {

    private static final SomeService someService = new SomeService();

    public static void main(String[] args) {
        try {
            unchecked();
        }catch (NullPointerException n) {
            n.printStackTrace();
            checked();
        }
    }

    //in this example, when we try to access the street, the system will throw an new pointer exception telling that
    //the he couldn't access getStreet() because getAddress() it was null.
    // to enable this feature, we need to pass a new argument to the JVM: -XX:+ShowCodeDetailsInExceptionMessages
    private static void unchecked(){
        Person person = someService.findPerson();
        System.out.println(person.getName());
        System.out.println(person.getDateOfBirth().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println(person.getAddress().getStreet());
        System.out.println(person.getAddress().getNumber());
    }

    //when we throws a NullPointerException on purpose, the behavior still the same as usual.
    //we can see below;
    private static void checked() {
        throw new NullPointerException();
    }
}
