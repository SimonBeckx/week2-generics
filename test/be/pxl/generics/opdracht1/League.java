package be.pxl.generics.opdracht1;

import java.util.ArrayList;

public class League<T extends Player> {
	ArrayList<Team<T>> league = new ArrayList<>();
	
	public void addTeam(Team<T> team) {
		league.add(team);
	}
	
	public void printTeams() {
		for (Team<T> team : league) {
			System.out.println("Naam:" + team.getName() + " Punten: " + team.ranking());
		}
	}
}
