package design_pattern.factory_pattern;

class CalculatorAdd extends Calculator{
    @Override
    public int calculate() {
        int total = 0;
        for(Integer i: numbers){
            total += i;
        }
        return total;
    }
}
