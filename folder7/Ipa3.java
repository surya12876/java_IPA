
import java.util.*;
class Players {
    private int playerId;
    private String skill;
    private String level;
    private int points;
    public Players(int playerId, String skill, String level, int points){
        this. playerId =playerId;
        this.skill= skill;
        this.level= level;
        this.points= points;
    }
    public  void setplayerId( int playerId){
        this.playerId=playerId;
    }
    public int getplayerId(){
        return this.playerId;
    }
    public void setskill(String skill){
        this.skill=skill;

    }
    public String getskill(){
        return this.skill;
    }
    public void setlevel(String level){
        this.level=level;
    }
    public String getlevel(){
        return this.level;
    }
    public void setpoints(int points){
     this.points =points;
    }
    public int getpoints(){
        return this.points;
    }
}

public class Ipa3 {
    public static int findPointsForGivenSkill (Players[] players, String skill){
        int sum=0;
        for (Players player :players){
            System.out.println("the skills are"+player.getskill());
            if(player.getskill().equals(skill)){
                sum+=player.getpoints();
            }
        }
        return  sum;
    }
    public static Players[] getPlayerBasedOnLevel(Players[] players,String skill , String level){
        Players[] player2 = new Players[0];
        for (Players player :players){
            if(player.getlevel().equals(level)&& player.getskill().equals(skill)&&player.getpoints()>20){
                player2 =Arrays.copyOf(player2,player2.length+1);
                player2[player2.length-1]=player;
            }
        }
        return player2;
    }
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        Players[] players= new Players[4];
        for(int i=0; i<players.length;i++){
            int playerId= scan.nextInt(); scan.nextLine();
            String  skill =scan.nextLine();
            String  level =scan.nextLine();
            int  points =scan.nextInt();scan.nextLine();
            players[i]=new Players(playerId, skill, level, points);
        }
        
        String testskill =scan.nextLine();
      String testlevel= scan.nextLine();
      int point_count =findPointsForGivenSkill(players, testskill);
      if(point_count>0){
        System.out.println(point_count);
      }
      else{
        System.out.println("The given Skill is not available");
      }
        Players[] player2=getPlayerBasedOnLevel(players, testskill,testlevel);
      if(player2==null){
        System.out.println("No player is available with specified level, skill \r\n" + //
                        "and eligibility points");
      }
      else{
      for(Players p : player2){
        System.out.println(p.getplayerId());
      }
      }
  
    }
}