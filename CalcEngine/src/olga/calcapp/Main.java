package olga.calcapp;

import olga.calcengine.Adder;
import olga.calcengine.CalculateBase;
import olga.calcengine.CalculateHelper;
import olga.calcengine.Divider;
import olga.calcengine.InvalidStatementException;
import olga.calcengine.MathEquation;
import olga.calcengine.Multiplier;
import olga.calcengine.Subtracter;

public class Main {
//        MathEquation testEquation = new MathEquation();        
//        testEquation.execute();
//        System.out.print("test=");
//        System.out.println(testEquation.getResult());
    
    public static void main(String[] args) {
        String[] statements = {
            "add 1.0",
            "add xx 25.0",
            "addX 0.0 0.0",
            "divide 100.0 50.0",
            "add 25.0 92.0",
            "subtract 225.0 17.0",
            "multiply 11.0 3.0"
        };
        CalculateHelper helper = new CalculateHelper();
        for(String statement : statements) {
            try {
                helper.process(statement);
                System.out.println(helper);
            } catch (InvalidStatementException e) {
                System.out.println(e.getMessage());
                if(e.getCause() != null)
                    System.out.println(" Original exception: " + e.getCause().getMessage());
            }
        }
    }
    
    static void useMathEquation() {            
        MathEquation[] equations = new MathEquation[4];
        equations[0] = new MathEquation('d', 100.0d, 50.0d);
        equations[1] = new MathEquation('a', 25.0d, 92.0d);
        equations[2] = new MathEquation('s', 225.0d, 17.0d);
        equations[3] = new MathEquation('m', 11.0d, 3.0d);
               
        for(MathEquation equation : equations){
            equation.execute();
            System.out.println("result= "+equation.getResult());
                }
        
        System.out.println();
        System.out.println("Using overloads");
        System.out.println();
        
        double leftDouble = 9.0d;
        double rightDouble = 4.0d;
        
        int leftInt = 9;
        int rightInt = 4;
        
        MathEquation equationOverload = new MathEquation('d');
        equationOverload.execute(leftDouble, rightDouble);
        System.out.print("result=");
        System.out.println(equationOverload.getResult());
        
        equationOverload.execute(leftInt, rightInt);
        System.out.print("result=");
        System.out.println(equationOverload.getResult());
        
        equationOverload.execute((double)leftInt, rightInt);
        System.out.print("result=");
        System.out.println(equationOverload.getResult());
        
        System.out.println();
        System.out.println("Using inheritance");
        System.out.println();
        
        CalculateBase[] calculators = {
            new Divider(100.0d, 50.0d),
            new Adder(25.0d, 92.0d),
            new Subtracter(225.0d, 17.0d),
            new Multiplier(11.0d, 3.0d)       
        };
        
        for(CalculateBase calculator:calculators){
            calculator.calculate();
            System.out.print("result=");
            System.out.println(calculator.getResult());
        }
        
        
        System.out.println("Success");
  }    

    
}
