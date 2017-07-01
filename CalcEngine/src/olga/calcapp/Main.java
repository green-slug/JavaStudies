package olga.calcapp;

import olga.calcengine.Adder;
import olga.calcengine.CalculateBase;
import olga.calcengine.CalculateHelper;
import olga.calcengine.Divider;
import olga.calcengine.DynamicHelper;
import olga.calcengine.InvalidStatementException;
import olga.calcengine.MathEquation;
import olga.calcengine.MathProcessing;
import olga.calcengine.Multiplier;
import olga.calcengine.PowerOf;
import olga.calcengine.Subtracter;

public class Main {
//        MathEquation testEquation = new MathEquation();        
//        testEquation.execute();
//        System.out.print("test=");
//        System.out.println(testEquation.getResult());
    
    public static void main(String[] args) {
        String[] statements = {
            "add 1.0 2.0",
            "power 5.0 2.0"
           
        };
        DynamicHelper helper = new DynamicHelper(new MathProcessing[] {
            new Adder(),
            new PowerOf()
        } );
        
        for (String statement:statements){
            String output = helper.process(statement);
            System.out.println(output);
        }
        
        }
    
    public static void useCalculateHelper() {
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
    
}
