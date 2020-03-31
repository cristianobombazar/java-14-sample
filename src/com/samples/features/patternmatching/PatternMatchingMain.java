package com.samples.features.patternmatching;

public class PatternMatchingMain {

    public static void main(String[] args) {
        //old way
        moveOldWay(new Bird());
        moveOldWay(new Fish());
        moveOldWay(new Kangaroo());
        moveOldWay(null);

        // new way
        moveNewWay(new Bird());
        moveNewWay(new Fish());
        moveNewWay(new Kangaroo());
        moveNewWay(null);

        stringExample("Testing pattern matching");
        mixExample("Mixing pattern matching");
    }



    //before the pattern matching for each type of animal, we would do a cast and then the logic like we can see below
    //of course we can do something like this ((Bird) animal).swim(); But still needs to do the cast after the conditional checking
    private static void moveOldWay(Animal animal) {
        if (animal instanceof Fish){
            Fish fish = (Fish) animal;
            fish.swim();
        } else if (animal instanceof Bird){
            Bird bird = (Bird) animal;
            bird.fly();
        } else if (animal instanceof Kangaroo){
            Kangaroo kangaroo = (Kangaroo) animal;
            kangaroo.jump();
        } else {
            System.err.println(animal + " is not a type of Animal.class");
        }
    }

    //with the new type test pattern, we can binding a variable, so you don't need to do the cast by yourself.
    //(of course the compiler will do it for you if the types matches)
    //for null values the behaviour
    private static void moveNewWay(Animal animal) {
        if (animal instanceof Fish fish){
            fish.swim();
        } else if (animal instanceof Bird bird){
            bird.fly();
        } else if (animal instanceof Kangaroo kangaroo) {
            kangaroo.jump();
        } else {
            System.err.println(animal + " is not a type of Animal.class");
        }
    }

    // you can also use a new conditional using the variable like the example below;
    private static void stringExample(Object object) {
        if (object instanceof String value && value.length() > 3) {
            System.out.println(value);
        }
    }

    //you can mix the pattern matching
    //the methods inside Comparable and String can be accessed by using "comparable" and "value".
    //of course this example doesn't make any sense, because string implements comparable, but its just for didactics.
    private static void mixExample(Object object) {
        if (object instanceof Comparable comparable && object instanceof String value && value.length() > 3) {
            System.out.println(value);
        }
    }

}
