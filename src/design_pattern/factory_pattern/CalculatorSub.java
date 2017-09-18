package design_pattern.factory_pattern;

class CalculatorSub extends Calculator{
    @Override
    public int calculate() {
            return numbers.get(0) - numbers.get(1);
        }
}
