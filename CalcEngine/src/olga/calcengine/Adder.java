package olga.calcengine;

public class Adder extends CalculateBase implements MathProcessing {
    public Adder(){};
    public Adder(double leftVal, double rightVal) {
        super(leftVal, rightVal);
    }
    
    @Override
    public void calculate(){
        double value = getLeftVal() + getRightVal();
        setResult(value);
    }

    @Override
    public String getKeyword() {
        return "add";
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public char getSymbol() {
        return '+';
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double doCalculation(double leftVal, double rightVal) {
        setLeftVal(leftVal);
        setRightVal(rightVal);
        calculate();
        
        return getResult();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
