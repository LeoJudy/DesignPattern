package design_pattern.factory_pattern;

class CalculatorDiv extends Calculator{
    @Override
    public int calculate() {
            return numbers.get(0) / numbers.get(1);
        }
}