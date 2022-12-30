
package lambda_expression;

@FunctionalInterface
interface Reference{
    
    public void display(String str);
}

public class Method_reference_using_Functional_Interface {
    
     public void meth1(String str){
    //public static void meth1(String str){    
        
    StringBuffer sb = new StringBuffer(str);
    sb.reverse();
    System.out.println(sb);
    }
    
    public static void main(String[] args) {
        
       // Reference ref =System.out::println;
       // ref.display("hello");
        
      //  Reference ref=Method_reference_using_Functional_Interface::meth1; --> This is for when meth1() method is static.
        //ref.display("Ajit");
        
  Method_reference_using_Functional_Interface hh = new  Method_reference_using_Functional_Interface();
  // when meth1() method is non static
        Reference ref=hh::meth1;
        ref.display("SUMIT");
    }
    
}
