package raidG;

import raidG.classes.Wclass;

public class player {
	
	//Name of player
	String playerName;
	Wclass wowclass;
	
	//Default Constructor
	public player(String name, Wclass wowclass) {
		this.wowclass=wowclass;
		this.playerName=name;
		System.out.println("name has been set to" + " " + playerName);
	}
	
	//Returns Name of player
	public String getName() {
		return playerName;
	}
	
	//Returns players class object.
	public Wclass getWclass() {
	
		return wowclass;
	}

}

	