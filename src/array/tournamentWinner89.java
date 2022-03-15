package array;

import java.util.ArrayList;
import java.util.HashMap;

public class tournamentWinner89 {

	// Reverse words in a String

	public int HOME_TEAM_WON = 1;
	  public String tournamentWinner(
	      ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
	    	String bestTeam="";
			  HashMap<String,Integer> scores = new HashMap<String,Integer>();
				scores.put(bestTeam,0);
			
			for(int idx = 0; idx < competitions.size() ; idx++)
			{
				ArrayList<String> competition = competitions.get(idx);
				int result = results.get(idx);
				String hometeam = competition.get(0);
				String awayteam	= competition.get(1);
				
				String winningTeam = (result == HOME_TEAM_WON ) ? hometeam : awayteam;
				updateScores(winningTeam,3,scores);
				
				if(scores.get(winningTeam) > scores.get(bestTeam))
				{
					bestTeam = winningTeam;
				}
			}
			
	    return bestTeam;
	  }
		public void updateScores(String team, int points, HashMap<String,Integer> scores){
			if(!scores.containsKey(team))
			{
				scores.put(team,0);
			}
			
			scores.put(team, scores.get(team) + points);
		}
}
