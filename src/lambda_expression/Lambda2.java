
package lambda_expression;

@FunctionalInterface
interface Lambda{
    
    public void show();
}

@FunctionalInterface
interface Ajit{
    
    public void display ();
    
 }

@FunctionalInterface
interface BajrangBali{
    
    public  void Sankatmochan(String str);
    
}

public class Lambda2 {
    
    public static void main(String[] args) {
        
        Lambda lm=()-> {System.out.println("Hello");};
        lm.show();
        
        Ajit aj=()-> {System.out.println("Hi");};
        aj.display();
        
        BajrangBali Bal=(s) -> {System.out.println("Jai Bajrang Bali");};
         Bal.Sankatmochan("s");
    }
    
}
