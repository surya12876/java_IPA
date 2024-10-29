
public class Ipa5 {
     public static void main(String[] args){
       int  i=15;
       String str=Integer.toBinaryString(i);
       System.out.println(str.length());
       int count=0;
      for(int j=0; j<str.length();j++){

        if(str.charAt(j) == '1'){
            count++;
        }
      }
   if(count%2!=0){
    System.out.println("odd parity");
   }
   else{
    System.out.println("even parity");
   }

       }
     }
    
