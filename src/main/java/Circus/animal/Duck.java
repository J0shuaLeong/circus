package Circus.animal;

public class Duck extends Bird {
    @Override
    public String speak() {
        return "Quack Quack";
    }
//hi
    @Override
    public String toString() {
        return "I'm a Duck";
    }

    public void swim() {
        System.out.println("I'm swimming...");
    }

    public int getValue() {
        return 10;
    }
}