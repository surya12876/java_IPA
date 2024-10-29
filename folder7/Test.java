
import java.util.*;


  
  class Testing{
      private int a;
     private int b;  
     public Testing(int a,int b){
      this.a =a;
      this.b=b;
     }
    
    public void   seta(int a){
      this.a =a;
      
    }
    public  int geta(){
      return a;
    }
    public void   setb(int b){
      this.b =b;
      
    }
    public  int getb(){
      return b;
    }
    public  int multiply(int a ,int b){
         return a*b;
    }
    public  int fact(int a){
           if(a>1){
            return fact(a-1)*a;
           }
           else{
            return 1;
           }
    }
 }

public class Test {

    public static void main(String[] args) {
      Scanner scan= new Scanner(System.in);
     ArrayList<Testing> test= new ArrayList<Testing>();
      for ( int i=0; i<3;i++){
     
        System.out.println("enter the value of a");
         int a= scan.nextInt();
         System.out.println("enter a value of b");
         int b =scan.nextInt();
         test.add( new Testing(a,b));
         
         
      }
      
   
      for( Testing t:test){
        System.out.println(Arrays.toString(t));
      }
          

    }
}