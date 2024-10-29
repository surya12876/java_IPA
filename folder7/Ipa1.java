
import java.util.*;
class Course{
    private int courseId;
    private String courseName;
    private String courseAdmin;
    private int  quiz;
    private int  handson;
    public Course(int courseId, String courseName, String courseAdmin, int quiz,int handson){
          this.courseId=courseId;
          this.courseName=courseName;
          this.courseAdmin= courseAdmin;
          this.quiz =quiz;
          this.handson = handson;


    }
    public void setcourseId(int CourseId){
         this.courseId= courseId;
    }
    public  int getcourseId(){
        return this.courseId;
    }
    public void setcourseName (String courseName ){
        this.courseName = courseName ;
   }
   public  String getcourseName (){
       return this.courseName ;
   }
   public void setcourseAdmin (String courseAdmin ){
    this.courseAdmin = courseAdmin ;
}
public  String getcourseAdmin (){
   return this.courseAdmin ;
}
public void setquiz (int quiz ){
    this.quiz = quiz ;
}
public  int getquiz (){
   return this.quiz;
}
public void sethandson (int handson ){
    this.handson = handson ;
}
public  int gethandson (){
   return this.handson ;
}
}

public class Ipa1 {
    public static Course[] sortCourseByHandsOn(Course[]course, int handson){
        Course[] course2= new Course[0];
        for(Course c :course){
            if(c.gethandson()<handson){
                course2 =Arrays.copyOf(course2,course2.length+1);
                course2[course2.length-1]=c;
            }
        
        }
        Course val;
       for (int i=0; i<course2.length;i++){
         for(int j=i+1; j<course2.length;j++){
                if(course2[i].gethandson() > course2[j].gethandson()){
                    val= course2[i];
                    course2[i]=course2[j];
                    course2[j]=val;
                }
         }
       }
       if(course2.length>0){
        return course2;
       }
       else{
        return null;
       }
    }
    public static  int findAvgOfQuizByAdmin(Course[]course,String admin){
        int sum=0;
        int count=0;
        for(Course c:course){
           
            if (c.getcourseAdmin().equalsIgnoreCase(admin)){
                sum=sum+c.getquiz();
                count++;
            }
        }
        if(count>0){
            return sum/count;
        }
        else{
            return  0;
        }
         
    }
    public static void main(String[] args){
     Scanner scan= new Scanner(System.in);
     Course[] course=new Course[4];
     for (int i =0; i<course.length;i++){
        System.out.println("please enter  courseId");
        int courseId =scan.nextInt(); scan.nextLine();
        System.out.println("please enter  coursename");
        String courseName = scan.nextLine();
        System.out.println("please enter  coursea admin");
        String courseAdmin =scan.nextLine();
        System.out.println("please enter  quiz");
        int  quiz =scan.nextInt(); scan.nextLine();
        System.out.println("please enter  handson");
        int handson= scan.nextInt(); scan.nextLine();
        course[i]=new Course(courseId, courseName,courseAdmin,quiz,handson);
        
     }
     System.out.println("please enter admin");
      String admin =scan.nextLine();
      System.out.println("please enter handson ");
      int handson =scan.nextInt();
      int ans1=  findAvgOfQuizByAdmin(course, admin);
      if(ans1>0){
        System.out.println(ans1);
        
      }
      else{
        System.out.println("no courses found");
      }
     
    
    Course[] ans2 = sortCourseByHandsOn(course, handson);
		if(ans2!=null)
		{
			for(int i=0; i<ans2.length; i++)
			{
				System.out.println(ans2[i].getcourseName());
			}
		}
		else
		{
			System.out.println("No Course found with mentioned attribute.");
		}
}
}