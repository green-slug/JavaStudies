package helloworld;

public class HelloWorld {

    public static void main(String[] args) {
    //arrays
        float[] theVals = {5.1f, 10.2f, 25.3f};
        float sum = 0.0f;
        
        for (float currentVal : theVals) {
            sum += currentVal;
        }
    
    int iVal = 13;
    
    switch(iVal % 2) {
        case 0:
            System.out.print(iVal);
            System.out.println(" is even");
            break;
        case 1:
            System.out.print(iVal);
            System.out.println(" is odd");
            break;
        default:
            System.out.println("broken");
            break;
    }
        
        System.out.println("Hello World lalla ");
        
    }
    
}
