
package lambda_expression;

@FunctionalInterface
interface MyLambda
{
    
    public void display();
    
} 

/*class MyClass implements MyLambda
{
    
   @Override
   public void display()
   {
        
        System.out.println("My first lambda expression");
        
   }
} */
   
public class Lambda_Expression {

    public static void main(String[] args) {
        
       // MyClass my = new MyClass();
        
        // MyLambda my = new MyClass();   
            
        MyLambda my =()-> {System.out.println("My First Lambda Expression");};
            
           my.display();   
            
    }
        
} 
      
    


