package sbt.stack;

import java.util.ArrayList;

public class StackImpl implements Stack{

    Integer[] container;
    int counter;
    int limit;

    public StackImpl(int limit){
        this.limit = limit;
        container = new Integer[limit];
    }

    @Override
    public Integer get() {
        Integer result = null;
        if (counter == 0){
            throw new IllegalStateException("Stack is empty");
        } else{
            result = container[counter-1];
            counter--;
        }
        return result;
    }

    @Override
    public void add(Integer i) {
        if (counter == limit){
            throw new IllegalStateException("Stack is full");
        }else {
            counter++;
            container[counter - 1] = i;
        }
    }
}
