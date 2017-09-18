package design_pattern.factory_pattern;

public class CalculatorFactory {

    static Calculator getCalculator(Calculator.OPERATE operate){
        switch (operate){
            case ADD:return new CalculatorAdd();
            case DIV:return new CalculatorDiv();
            case MUL:return new CalculatorMul();
            default:{}
        }
        return new CalculatorSub();
    }
}
