
package lambda_expression;

import java.lang.Runnable;

public class Thread_in_LambdaExpression  {
    
    public static void main(String[] args) {
        
        // First Thread Ajit
        
        Runnable r1=()->{
            
           for(int i=1;i<=10;i++){
               
               System.out.println("value of Ajit is " +i);
               try {
                   Thread.sleep(1000);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           } 
        };
          Thread t= new Thread(r1);
          t.setName("Ajit Thread");
          t.start();
          
          //Second Thread BUNTY
          
          Runnable r2=()->{
            
           for(int j=1;j<=10;j++){
               
               System.out.println("value of BUNTY is " +j*2);
               try {
                   Thread.sleep(2000);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           } 
        };
          Thread t2 = new Thread(r2);
          t2.setName("Bunty");
          t2.start();
       
        
    }
    
}
