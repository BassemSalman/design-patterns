package Behavioral.Strategy;

public class Calculator {
    private MathOperation mathOperation;

    public Calculator(MathOperation mathOperation) {
        this.mathOperation = mathOperation;
    }

    public void setMathOperation(MathOperation mathOperation) {
        this.mathOperation = mathOperation;
    }

    public double doCalculation(double a, double b){
        return mathOperation.calculate(a,b);
    }
}
