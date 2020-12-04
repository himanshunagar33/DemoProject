package BeginnersLevel;

import java.util.ArrayList;
import java.util.List;

//Player class 
class Player { 

 private int id;
 private String team;
 private String name;

 public Player(String name, int id, String team){
     this.id=id;
     this.team=team;
     this.name=name;
 }

} 

/* Team class contains a list of Player
Objects.*/
class Team { 

private String teamname;
private List<Player> players;
 public Team(String teamname, List<Player> players){
     this.teamname=teamname;
     this.players=players;
 }
 public List<Player> getplayers(){
     return players;
 }
 // Complete the implementation

} 

/* School class contains a list of Team 
Objects.*/
class School { 
private String schoolname;
private List<Team> teams;

public School(String schoolname, List<Team> teams){
   this.schoolname=schoolname;
   this.teams=teams;
}
 // Complete the implementation
 public int getTotalPlayersInSchool(){
     int totalplayers=0;
     List<Player> players; 
     for (Team team: teams){
         players =team.getplayers();
         for(Player p: players){
             totalplayers++;
         }
     }
     return totalplayers;
 }

}  

//Main class
class AggregationDemo { 

 public static void main (String[] args) { 

 Player p1 = new Player("Harris", 1, "Red");
 Player p2 = new Player("Carol", 2, "Red");
 Player p3 = new Player("Johnny", 1, "Blue");
 Player p4 = new Player("Sarah", 2, "Blue");
/* Making a List of  
     "Red" team Players. */
 List <Player> red_players = new ArrayList<Player>(); 
 red_players.add(p1); 
 red_players.add(p2); 

 /* Making a List of  
     "Blue" team Players. */ 
 List <Player> blue_players = new ArrayList<Player>(); 
 blue_players.add(p3); 
 blue_players.add(p4);  

 Team Redteam= new Team("Red",red_players);
 Team Blueteam= new Team("Blue",blue_players);

 List <Team> schoolteam= new  ArrayList<Team>(); 
 schoolteam.add(Blueteam);
 schoolteam.add(Redteam);

 School NayaSchool = new School("Naya School", schoolteam);
 System.out.println(" Total number of Students : " + NayaSchool.getTotalPlayersInSchool());

 } 

} 

