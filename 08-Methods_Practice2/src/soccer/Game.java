/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package soccer;

import utility.GameUtils;



/**
 *
 * @author Administrator
 */
public class Game {
    
    public Team homeTeam;
    public Team awayTeam;
    public Goal[] goals;
    
    /* Practice 8-2. Add playGame() method here */
    public void playGame(){
        
//        Game this = new Game();
        int numberOfGoals = (int)(Math.random() * 7);
        System.out.println(numberOfGoals);
        Goal[] theGoals = new Goal[numberOfGoals];
//      System.out.println(theGoals.length);
        this.goals = theGoals;
        GameUtils.addGameGoals(this); 
//        for (Goal currGoal: this.goals){
//            System.out.println("Goal scored after " +
//                    currGoal.theTime + " mins by " +
//                    currGoal.thePlayer.playerName +
//                    " of " + currGoal.theTeam.teamName);
        StringBuilder returnString = new StringBuilder();
        for (Goal currGoal: this.goals) {
            returnString.append("Goal scored after "
            + currGoal.theTime + " mins by "
            + currGoal.thePlayer.playerName + " of "
            + currGoal.theTeam.teamName + "\n");
        }

        }
    }
    
    /* Practice 8-2. Add getDescription() method here */
//     public String getDescription() {
        
//     }  
//}
