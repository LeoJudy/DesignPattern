package design_pattern.factory_pattern;

public class FactoryPatternMain {



    public static void main(String[] args){
        Calculator calculator = CalculatorFactory.getCalculator(Calculator.OPERATE.ADD);
        for(int i = 1; i < 101; i++){
            calculator.setNumber(i);
        }
        System.out.println(calculator.calculate());
    }
}
