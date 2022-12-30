
package lambda_expression;

@FunctionalInterface
interface BajrangBali2{
    
    public  void Sankatmochan(String str);
    
}

public class Method_Reference_Example2 {
    
    public static void Method3(String str1){
        
        StringBuffer sb = new StringBuffer(str1);
        sb.reverse();
        System.out.println(sb);
    }
    
    public static void main(String[] args) {
        
      //Exaple 1: Using a different class method and calling Functional Interface method.
         // if same example if Method3() was non static the we neeed to follow ordinary process to create its object and use it.
          //i.e Method_Reference_Example2  rr = new Method_Reference_Example2 ();
          // and BajrangBali2 BB=rr::Method3;
          
        BajrangBali2 BB=Method_Reference_Example2 ::Method3; //Method refernce
        BB.Sankatmochan("OMO");
    
     /*Example 2: As a display :: println method   
        
    BajrangBali2 BB=System.out::println;       // Here we make use of scope resolution operator :: 
                                               // where println becomes method parameter for Sankatmochan interface method()
    BB.Sankatmochan("Jai Bajrang Bali2");
    }*/
    
    }   

}