
//Note : We can make use of as many methods and constructor and use the FunctionaInterface method.
        // it depens upon our project requirement.

package lambda_expression;

@FunctionalInterface
interface Shaktimaan{
    
    public void display(String str);
}

class Test{
    
  Test(String s){
    
      System.out.println(s.toUpperCase());
  }  
}
public class Constructor_using_an_FunctionalInterface {
 
    public static void main(String[] args) {
        
        Shaktimaan sh=Test::new; // Using scope operator :: with new (::new) this will call the constructor Test
                                 // and the constuctor test will call diplay() methof of interface.
        sh.display("hello");
        
    }
}

