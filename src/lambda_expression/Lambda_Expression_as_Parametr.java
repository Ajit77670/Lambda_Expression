
package lambda_expression;
import java.lang.annotation.Annotation;

@FunctionalInterface
interface MyInterface{
    
    public void Param1(String str); // 1-Parameter
}

@FunctionalInterface
interface MyInterface2{
    
    public int Param2(int x, int y); // Multiple Parameter
}

@FunctionalInterface
interface MyInterface3{
    
    public int Param2(int x, int y); // Multiple Parameter

}



public class Lambda_Expression_as_Parametr {
    
    public static void main(String[] args) {
        
        MyInterface Inter=(s)->System.out.println(s); // Lambda Expression for MyInterface
        Inter.Param1("Hello");
        
        MyInterface2 fm=(a,b)->{return a+b;}; // Lamda Expression for MyInterface2
        System.out.println(fm.Param2(12, 13));
        
        MyInterface3 ef=(d,e)-> d*e; // Lamda Expression for MyInterface3
                                      // we can remove return type also.
        System.out.println(ef.Param2(2, 3));
        
         }
            
        
 
        
    }
    

