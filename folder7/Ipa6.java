
import java.util.Arrays;
import java.util.Scanner;

class  NavalVessel {
    int vesselId,comp,planned;
    String vesselName, purpose;
    public NavalVessel(int vesselId,  String vesselName, int planned,int comp, String purpose){
        this.vesselId=vesselId;
        this.comp=comp;
        this.planned=planned;
        this.vesselName=vesselName;
        this.purpose=purpose;
    }
    public   void setvesselId(int vesselId){
        this.vesselId=vesselId;
    }
    public int getvesselId(){
        return this.vesselId;
    }

    public void setcomp(int comp){
        this.comp=comp;
    }
    public int getcomp(){
        return this.comp;
    }
    public void setplanned(int planned){
        this.planned=planned;
    }
    public int getplanned(){
        return this.planned;
    }
    public void setvesselName(String vesselName){
        this.vesselName=vesselName;
    }
    public String getvesselName(){
      return  this.vesselName;
    }
public void setpurpose(String purpose){
    this.purpose = purpose;
    
}
public String getpurpose(){
    return this.purpose;
}
    }

public class Ipa6 {

    public static  NavalVessel[] findVesselByGrade(NavalVessel[] vessel, String purpose){
        NavalVessel[] vessel2= new NavalVessel[0];
        for(NavalVessel v :vessel){
            if(v.getpurpose().equalsIgnoreCase(purpose)){
                vessel2=Arrays.copyOf(vessel2,vessel2.length+1);
                 vessel2[vessel2.length-1]=v;
            }

        }
        if(vessel2.length>0){
        return vessel2;}
        else{
            return null;
        }

    }
    public  static int findAvgVoyagesByPct(NavalVessel[] vessel, int percent){
        int sum=0;
        int count=0;
        for( NavalVessel v: vessel){
            if(((v.getcomp()*100)/v.getplanned())>percent){

                sum+=v.getcomp();
                count++;
            }
        }
        if(count>0){
        int avg = sum/count;
        return avg;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
    NavalVessel[] vessel= new NavalVessel[4];
    for (int i=0;i<vessel.length;i++){
        int vesselId= scan.nextInt(); scan.nextLine();
        String vesselName=scan.nextLine();
        int planned =scan.nextInt();scan.nextLine();
        int comp  = scan.nextInt();scan.nextLine();
        String purpose=scan.nextLine();
        vessel[i]= new NavalVessel(vesselId, vesselName, planned,comp , purpose);
    }
    int percent = scan.nextInt(); scan.nextLine();
    String testpurpose= scan.nextLine();
    NavalVessel[] vessel2= findVesselByGrade(vessel,testpurpose);
   
        System.out.println(findAvgVoyagesByPct(vessel, percent));
     
        for(NavalVessel v:vessel2){
            if(((v.getcomp()*100)/v.getplanned())>100){
                System.out.println(v.getvesselName()+"%star");
 

        }
        if(((v.getcomp()*100)/v.getplanned())>=80 && ((v.getcomp()*100)/v.getplanned())<=99){
            System.out.println(v.getvesselName()+"%leader");


    }
    if(((v.getcomp()*100)/v.getplanned())>=55 && ((v.getcomp()*100)/v.getplanned())<=79){
        System.out.println(v.getvesselName()+"%inspirer");


}else{
    System.out.println(v.getvesselName()+"%Striver");
}
      

    }
}
}
