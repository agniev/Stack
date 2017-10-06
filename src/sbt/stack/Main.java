package sbt.stack;

public class Main {
    public static void main(String[] args) {
        Stack myStack = new StackImpl(3);
        Integer var1 = 10;
        Integer var2 = 20;
        Integer var3 = 30;
        Integer var4 = 40;
        myStack.add(var1);
        System.out.println(myStack.get());
    }
}
