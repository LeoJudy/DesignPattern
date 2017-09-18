package design_pattern.factory_pattern;

class CalculatorMul extends Calculator{
    @Override
    public int calculate() {
        int total = 1;
        for(Integer i: numbers){
            total *= i;
        }
        return total;
    }
}
