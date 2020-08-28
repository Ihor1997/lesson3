package main.java.lesson9;

public class Animal {

    public String name = "Animal";

    public void sleep() {
        System.out.println("I am sleeping ***");
    }

    @Override
    public String toString() {
        System.out.println("Invoked method 'toString()'");
        return "Hello my name is :"  + this.name;
    }
}
