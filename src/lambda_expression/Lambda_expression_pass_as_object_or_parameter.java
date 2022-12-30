
package lambda_expression;

@FunctionalInterface
interface Maa{

public void Love();
}

class Test1    
{
    
    public void Ajit(Maa amma){ // class Test1 calls Maa interface with refernce amma.
        
        amma.Love(); // calling maa interface method (Love()),by its refrence amma.
    }
    
}

class Test2{
    
    public void Sumit(){ // calss Test2 calling maa interface method(love) with help of class Test1.
        
        Test1 t = new Test1();
        t.Ajit(()->{System.out.println("Hello Bhai");}); // Lambda Expression for FunctionalInterface
    }
    
}


public class Lambda_expression_pass_as_object_or_parameter {
    
    public static void main(String[] args) {
        
    
    Test2 t1 = new Test2();
    
        t1.Sumit();
}

}
