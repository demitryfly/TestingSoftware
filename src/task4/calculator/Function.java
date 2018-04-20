package task4.calculator;

public class Function extends Pow implements ICalculator {

    private ICalculator funLog;
    private ICalculator funTrg;

    public Function(ICalculator funLog, ICalculator funTrg) {
        this.funLog = funLog;
        this.funTrg = funTrg;
    }

    @Override
    public double calc(double x) {
        if (x <= 0)
            return funTrg.calc(x);
        else
            return funLog.calc(x);
    }
}
