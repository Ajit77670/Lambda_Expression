
package lambda_expression;

@FunctionalInterface
interface Ajit11{
    
public  void display();    
}

class Test{
    
    int j =10; //Instance variable i.e class Variable
    
    public  void method1(){
        
       int i =0; // Local Variable for method1()
       
        Ajit11 aj=()->{ // Declare Lambda expression inside a method.
        
        int k =0; // Lambda expression can have its own variable
            
        System.out.println("Hi Ajit"); // Lambda Expression can have as many sout statements. 
        System.out.println("Hi Bunty");
        
        k++; // We can modify or increment/decrement Lambda own variables. 
      //i++; //---> Local variable for methods can not be changes inside Lambda expression statement. As it considered as final.
        j++; // we can increment/decrement instance variable(i.e class variable) into Lambda expression.
      
        };       // end of Lambda expression
        
        aj.display(); //calling interface method by its lambda expression.
    }      
        
  }


public class Lambda_as_Local_and_Instance_Varaible {
    
    public static void main(String[] args) {
        
        Test t = new Test();
        t.method1(); // Calling interface method dispaly() by method1(). 
        
    }
    
}

