
import java.util.Arrays;
import java.util.Scanner;

class Medicine  {
   private String  MedicineName;
   private String batch;
   private String disease;
   private int  price;
   public Medicine(String MedicineName, String batch , String disease, int price){
    this.MedicineName = MedicineName;
    this.batch =batch ;
    this.disease= disease;
    this.price = price;
   }
    public  void setMedicineName(String MedicineName){
        this.MedicineName=MedicineName;
    }
    public String getMedicineName(){
        return this.MedicineName;
    }

    public void setbatch(String batch){
        this.batch=batch;
    }
    public String getbatch(){
        return  this.batch;
    }

    public void setdisease(String disease){
        this.disease=disease;
    }
    public String getdisease(){
        return this.disease;
    }
    public void setprice(int price){
        this.price=price;
    }
    public int getprice(){
        return this.price;
    }
   }


public class Ipa4 {
   public   static int[] getsortdisease(Medicine[] medicine, String diseasename){
    int[] medicine2= new int[0];
    int count=0;
    for( Medicine m : medicine){
        if(m.getdisease().equals(diseasename)){
            count++;
            medicine2= Arrays.copyOf(medicine2,medicine2.length+1);
            medicine2[medicine2.length-1]=m.getprice();
           
         
        }
       
    }
    Arrays.sort(medicine2);
    
   
    return medicine2;
   }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Medicine[] medicine = new Medicine[4] ;
    for(int i=0;i<medicine.length;i++){
          String medicineName= scan.nextLine();
          String batch =scan.nextLine();
          String disease =scan.nextLine();
          int price =scan.nextInt();scan.nextLine();
           medicine[i]=new Medicine(medicineName, batch,disease, price);
    }
    String testdisease= scan.nextLine();
   
        System.out.println(Arrays.toString(getsortdisease(medicine,testdisease)));
    }
    
}
