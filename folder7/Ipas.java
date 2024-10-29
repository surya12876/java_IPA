import  java.util.*;
class Smallipa{
    
    public boolean armstrong(int num){
        int num3=num;
        int digits =String.valueOf(num).length();
        int sum=0;
        while(num !=0){
          int  num2 = num%10;
          
          
           System.out.println("num is"+num);
           sum=sum+ (int)Math.pow(num2,digits);
           num=num/10;
         
        }
        System.out.println(sum);
        if (sum==num3){
           return true;
        }
        else{
            return false;
        }

    }
    public String stringcount(String str){
       String str2="";
       int count=0;
        for(char s :str.toCharArray()){
            if(!(str2.contains(String.valueOf(s)))){
            for (int j=0;j<str.length();j++){
                  if(s ==str.charAt(j) ){
                    count++;
                  }
         
            }}
            else{
                continue;
            }
            str2+=s+String.valueOf(count);
          count=0;

        }
        return str2;
    }
}
public class Ipas {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();scan.nextLine();
        String str =scan.nextLine();
        Smallipa smallipa =new Smallipa();
        if(smallipa.armstrong(num)){
            System.out.println("it is a armstrong");
        }
        else{
            System.out.println("not a armstrong");
        }
       System.out.println(smallipa.stringcount(str));
    }
}
