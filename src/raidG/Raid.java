package raidG;

import java.util.ArrayList;

import raidG.classes.Priest;
import raidG.classes.Wclass;
import raidG.classes.abilities.DivineHymn;
import raidG.classes.abilities.abilities;

public class Raid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RaidG raid=new RaidG();
		
		raid.setRaidG(createRaidTest());
		raid.places.get(1).getWclass().getabilities();


	}
	
	public static ArrayList<player> createRaidTest(){
		
		ArrayList<player> players=new ArrayList<player>();
		Wclass Priest=new Priest();
		player jessie=new player("healer",Priest);
		player spiffy=new player("healer",Priest);
		player zombie=new player("healer",Priest);
		player cotton=new player("healer",Priest);
		players.add(jessie);
		players.add(spiffy);
		players.add(zombie);
		players.add(cotton);
		return players;
		
	}

}
