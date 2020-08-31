package main.java.lesson9;

public class ImmortalPony  extends Animal implements IMachineble{
    @Override
    public String getName() {
        return "Pony";
    }

    @Override
    public void repair() {
        System.out.println("Repare");
    }
}
