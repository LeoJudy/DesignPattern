package design_pattern.factory_pattern;

import java.util.ArrayList;
import java.util.List;

public abstract class Calculator {
    public enum OPERATE{
        ADD,
        SUB,
        MUL,
        DIV,
    }
    protected List<Integer> numbers = new ArrayList<>();

    public void setNumber(int number){
        numbers.add(number);
    }

    public abstract int calculate();
}
