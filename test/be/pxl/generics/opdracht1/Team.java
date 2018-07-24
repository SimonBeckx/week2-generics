package be.pxl.generics.opdracht1;

import java.util.ArrayList;

public class Team<T extends Player> {

	private String name;
	private int played;
	private int won;
	private int lost;
	private int tied;
	private ArrayList<T> members;
	
	//constructor
	public Team(String name) {
		super();
		this.name = name;
		members = new ArrayList<>();
	}
	
	//methods
	
	public void addPlayer(T player){
		if (!members.contains(player)) {		
			members.add(player);
		}
	}
	
	public int numberOfPlayers() {
		return members.size();
	}
	
	public void matchResult(Team<T> teamOpponent, int ourScore, int theirScore) {
		teamOpponent.played++;
		this.played++;
		if (ourScore == theirScore) {
			this.tied++;
			teamOpponent.tied++;
		}
		else if (ourScore > theirScore) {
			this.won++;
			teamOpponent.lost++;
		}
		else {
			teamOpponent.won++;
			this.lost++;
		}
	}
	
	public int ranking() {
		int points = 0;
		points += won*3;
		points +=tied;
		return points;
	}
	//getters
	public String getName() {
		return name;
	}

	public int getPlayed() {
		return played;
	}

	public int getWon() {
		return won;
	}

	public int getLost() {
		return lost;
	}

	public int getTied() {
		return tied;
	}

	public ArrayList<T> getMembers() {
		return members;
	}

	
	
	
	
	
	
}
