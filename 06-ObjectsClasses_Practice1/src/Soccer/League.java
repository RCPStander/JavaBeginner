/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soccer;

/**
 *
 * @author stand
 */
public class League {
    public static void main(String[] args) {
        //TODO code application logic here
        Player player1 = new Player();
        player1.playerName = "George Eliot";
        Player player2 = new Player();
        player2.playerName = "Graham Green";
        Player player3 = new Player();
        player3.playerName = "Geoffrey Chaucer";
        
        Player[] thePlayers = {player1, player2, player3};
        
        Team team1 = new Team();
        team1.teamName ="The Greens";
        
        team1.playerArray = thePlayers;
        
//        player1.playerName = "Robert Service";
        
        for(Player thePlayer: team1.playerArray){
            System.out.println(thePlayer.playerName);
        }
        
        Team team2 = new Team();
        team2.teamName = "The Reds";
        
        team2.playerArray = new Player[3];
        
        team2.playerArray[0] = new Player();
        team2.playerArray[0].playerName = "Robert Service";
        team2.playerArray[1] = new Player();
        team2.playerArray[1].playerName = "Robbie Burns";
        team2.playerArray[2] = new Player();
        team2.playerArray[2].playerName = "Rafael Sabatini";
        
        for(Player thePlayer: team2.playerArray){
            System.out.println(thePlayer.playerName);
        }
        
    }
}
